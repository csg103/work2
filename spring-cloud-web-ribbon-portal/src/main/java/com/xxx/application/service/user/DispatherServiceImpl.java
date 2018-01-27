package com.xxx.application.service.user;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xxx.Message;
import com.xxx.core.DispatherCoreService;
import com.xxx.utils.IpUtil;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Service
public class DispatherServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(DispatherServiceImpl.class);
    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "fallback")
    public Message excte(Message mes) {


        //添加用于判断XML表达式所标注的bean是否执行的参数map
        Map mapflag =new HashMap();
        mapflag.put("inta",9);
        mes.setExecuteflag(mapflag);
        //添加调用服务的服务名和方法名
        LinkedHashMap mapService =new LinkedHashMap();
        mapService.put("xml/excte","XMLSERVICE");
        mes.setExecuteMap(mapService);
        try {
            mes = DispatherCoreService.getService(restTemplate, mes);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mes;

    }
  private  Message checkMes(Message mes){
      if (StringUtils.isEmpty(mes.getC_interface_id()) || StringUtils.isEmpty(mes.getC_Interface_version()) || StringUtils.isEmpty(mes.getC_channel())) {
          mes.setReturnflag("false");
          mes.setC_fail_mes("接口名 版本号 渠道号 不能为空！！！");
          return mes;
      } else {
          return mes;
      }
  }
    public Message fallback(Message mes) {
        mes.setReturnflag("false");
        mes.setC_fail_mes("服务器反应时间超长！");
        return mes;
    }

    public Message initRequestMessage(HttpServletRequest req) {
        Message mes = new Message();
        mes.setC_request_ip(IpUtil.getIpAddr(req));
        mes.setD_date_tIme(new Date());
        mes.setC_request_url(req.getRequestURL().toString());
        mes.setC_request_type(req.getMethod());
        return mes;

    }

    public Message initDataMes(Message mes, String strMes) throws Exception {


        Map<String, String> map = new HashMap<>();
        //将json解析放入map
        try {
            JSONObject jasonObject = JSONObject.fromObject(strMes);
            Iterator iterator = jasonObject.keys();
            String key;
            while (iterator.hasNext()) {
                key = String.valueOf(iterator.next());
                map.put(key, jasonObject.get(key).toString());
            }
        } catch (Exception e) {
            log.error(this.getClass() + "portal 端 的 initDataMes 方法解析客户端传入0参数异常！！！");
            e.printStackTrace();
            throw e;
        }
        mes.setC_interface_id(map.get("c_interface_id"));
        mes.setC_Interface_version(map.get("c_version"));
        mes.setC_channel(map.get("c_channel"));
        mes.setReqMapObjectMes(map);

        mes = checkMes(mes);
        if(StringUtils.equals("false",mes.getReturnflag())){
            return mes;
        }
        return mes;
    }

}