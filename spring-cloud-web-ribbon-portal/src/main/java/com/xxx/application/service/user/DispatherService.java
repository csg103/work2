package com.xxx.application.service.user;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xxx.Message;
import com.xxx.staticMes.StaticMes;
import com.xxx.utils.IpUtil;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Service
public class DispatherService {
    private static final Logger log = LoggerFactory.getLogger(DispatherService.class);
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "fallback")
    public String excte(Message mes) {

        return restTemplate.postForEntity(StaticMes.getStaticMes(StaticMes.XMLSERVICE), mes, String.class).getBody();
    }

    public String fallback(Message mes) {

        return "spring cloud 服务提供者异常 无法在规定时间返回数据！";
    }

    public Message initRequestMessage(HttpServletRequest req) {
        Message mes = new Message();
        mes.setC_request_ip(IpUtil.getIpAddr(req));
        mes.setD_date_tIme(new Date());
        mes.setC_request_url(req.getRequestURL().toString());
        mes.setC_request_type(req.getMethod());
        return mes;

    }

    public Message initDataMes(Message mes, String strMes) {
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
        }
        mes.setC_interface_id(map.get("c_interface_id"));
        mes.setC_Interface_version(map.get("c_version"));
        mes.setC_channel(map.get("c_channel"));
        mes.setReqMapObjectMes(map);
        return mes;
    }

}