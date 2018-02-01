package com.xxx.application;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.xxx.pay.vo.UnifiedOrderRequestExt;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

@RestController
public class ComputeController {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/pay_add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return 2;
    }



    @RequestMapping("createQRCode")
    public void createQRCode() {

        //生成订单
        String orderInfo = createOrderInfo("234678");
        //调统一下单API
        String code_url = httpOrder(orderInfo);
        //将返回预支付交易链接（code_url）生成二维码图片
        //这里使用的是zxing   <span style="color:#ff0000;"><strong>说明1(见文末)</strong></span>
        try {
            int width = 200;
            int height = 200;
            String format = "png";
            Hashtable hints = new Hashtable();
            hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
            BitMatrix bitMatrix = new MultiFormatWriter().encode(code_url, BarcodeFormat.QR_CODE, width, height, hints);
            OutputStream out = null;
            //  out = response.getOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, format, out);
            out.flush();
            out.close();
        } catch (Exception e) {
        }

    }



    /**
     * 生成订单
     * @param orderId
     * @return
     */
    private String createOrderInfo(String orderId) {
        //生成订单对象
        UnifiedOrderRequestExt unifiedOrderRequest = new UnifiedOrderRequestExt();
        unifiedOrderRequest.setAppid("wxb585e5a351026de9");//公众账号ID
        unifiedOrderRequest.setAttach("支付测试");
        unifiedOrderRequest.setBody("APP支付测试");
        unifiedOrderRequest.setDevice_info("1000");
        unifiedOrderRequest.setMch_id("1497830612");//商户号
        unifiedOrderRequest.setNonce_str(makeUUID());//随机字符串       <span style="color:#ff0000;"><strong>说明2(见文末)</strong></span>
        unifiedOrderRequest.setNotify_url("xxxxxxxxxxxxxx");//通知地址
        unifiedOrderRequest.setOut_trade_no("1415659990");//商户订单号
        unifiedOrderRequest.setSpbill_create_ip("14.23.150.211");//终端IP
        unifiedOrderRequest.setTotal_fee("1");  //金额需要扩大100倍:1代表支付时是0.01
        unifiedOrderRequest.setTrade_type("APP");//JSAPI--公众号支付、NATIVE--原生扫码支付、APP--app支付
        unifiedOrderRequest.setSign(createSign(unifiedOrderRequest));//签名<span style="color:#ff0000;"><strong>说明5(见文末，签名方法一并给出)</strong></span>
        //将订单对象转为xml格式
        XStream xStream = new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_"))); //<span style="color:#ff0000;"><strong>说明3(见文末)</strong></span>
        xStream.alias("xml", UnifiedOrderRequestExt.class);//根元素名需要是xml
        return xStream.toXML(unifiedOrderRequest);
    }


    /**
     * 调统一下单API
     * @param orderInfo
     * @return
     */
    private String httpOrder(String orderInfo) {
        String url = "https://api.mch.weixin.qq.com/pay/unifiedorder";
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            //加入数据
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            BufferedOutputStream buffOutStr = new BufferedOutputStream(conn.getOutputStream());
            buffOutStr.write(orderInfo.getBytes());
            buffOutStr.flush();
            buffOutStr.close();

            //获取输入流
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line = null;
            StringBuffer sb = new StringBuffer();
            while((line = reader.readLine())!= null){
                sb.append(line);
            }
            logger.info(sb);
//            XStream xStream = new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_")));//说明3(见文末)
//            //将请求返回的内容通过xStream转换为UnifiedOrderRespose对象
//            xStream.alias("xml", UnifiedOrderRespose.class);
//            UnifiedOrderRespose unifiedOrderRespose = (UnifiedOrderRespose) xStream.fromXML(sb.toString());
//
//            //根据微信文档return_code 和result_code都为SUCCESS的时候才会返回code_url
//            //<span style="color:#ff0000;"><strong>说明4(见文末)</strong></span>
//            if(null!=unifiedOrderRespose
//                    && "SUCCESS".equals(unifiedOrderRespose.getReturn_code())
//                    && "SUCCESS".equals(unifiedOrderRespose.getResult_code())){
//                return unifiedOrderRespose.getCode_url();
//            }else{
//                return null;
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 创建UUID
     * @return
     */
    public static synchronized String makeUUID() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }


    /**
     * 生成签名
     * @return
     */
    private String createSign(UnifiedOrderRequestExt unifiedOrderRequest) {
        //根据规则创建可排序的map集合
        SortedMap<String, String> packageParams = new TreeMap<String, String>();
        packageParams.put("appid", unifiedOrderRequest.getAppid());
        packageParams.put("attach", unifiedOrderRequest.getAttach());
        packageParams.put("body", unifiedOrderRequest.getBody());
        packageParams.put("device_info", unifiedOrderRequest.getDevice_info());
        packageParams.put("mch_id", unifiedOrderRequest.getMch_id());
        packageParams.put("nonce_str", unifiedOrderRequest.getNonce_str());
        packageParams.put("notify_url", unifiedOrderRequest.getNotify_url());
        packageParams.put("out_trade_no", unifiedOrderRequest.getOut_trade_no());

        packageParams.put("spbill_create_ip", unifiedOrderRequest.getSpbill_create_ip());

        packageParams.put("total_fee", unifiedOrderRequest.getTotal_fee());

        packageParams.put("trade_type", unifiedOrderRequest.getTrade_type());



        StringBuffer sb = new StringBuffer();
        Set es = packageParams.entrySet();//字典序
        Iterator it = es.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String k = (String) entry.getKey();
            String v = (String) entry.getValue();
            //为空不参与签名、参数名区分大小写
            if (null != v && !"".equals(v) && !"sign".equals(k)
                    && !"key".equals(k)) {
                sb.append(k + "=" + v + "&");
            }
        }
        //第二步拼接key，key设置路径：微信商户平台(pay.weixin.qq.com)-->账户设置-->API安全-->密钥设置
        sb.append("key=" +"Ccrionline1381072999518511760420");
        String sign = MD5.MD5Encoder(sb.toString(), "utf-8")
                .toUpperCase();//MD5加密

        String str1 ="appid=wxb585e5a351026de9&attach=支付测试&body=xxxxxx&device_info=1000&mch_id=1497830612&nonce_str=7843fd37cb544c6181dcfd6828dd1c41&notify_url=xxxxxxxxxxxxxx&out_trade_no=1415659990&spbill_create_ip=14.23.150.211&total_fee=1&trade_type=APP&key=Ccrionline1381072999518511760420";
        String str2 = AppMD5Util.getMD5(str1).toUpperCase();//MD5加密

        return sign;
    }

}
