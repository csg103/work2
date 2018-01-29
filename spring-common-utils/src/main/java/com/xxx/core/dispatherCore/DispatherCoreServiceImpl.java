package com.xxx.core.dispatherCore;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.xxx.Message;
import com.xxx.staticMes.StaticMes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author csg
 * @create 2018-01-17:47
 */

public class DispatherCoreServiceImpl implements DispatherCoreService{
    private static  DispatherCoreService dispatherCoreService = new DispatherCoreServiceImpl();

    private static final Logger log = LoggerFactory.getLogger(DispatherCoreServiceImpl.class);
    public  Message getService(RestTemplate restTemplate, Message mes) {
        Map<String,String> map =mes.getExecuteMap();
        LinkedHashMap<String,String> executeMap =new LinkedHashMap();
        executeMap.putAll(map);
        map.clear();
        String key,value;
        try {
            for (Map.Entry<String, String> entry : executeMap.entrySet()) {
                value = StaticMes.getStaticMes(entry.getValue());
                key = entry.getKey();
                log.info("执行服务请求---"+value + key);
                String returnStr = restTemplate.postForEntity(value + key, mes, String.class).getBody();
                mes = JSON.parseObject(returnStr, new TypeReference<Message>() {
                });

            }
        }catch (IllegalStateException e){
            mes.setReturnflag("false");
            mes.setC_fail_mes("-----请检查是否所有的服务都已经启动！！！");
            log.error("------请检查是否所有的服务都已经启动！！！");
            e.printStackTrace();
            throw e;
        }
        executeMap.clear();
        return mes;
    }

    DispatherCoreServiceImpl() { }


    public static DispatherCoreService getDispatherCoreService() {
        return dispatherCoreService;
    }
}
