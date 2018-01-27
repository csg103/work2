package com.xxx.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.xxx.Message;
import com.xxx.staticMes.StaticMes;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author csg
 * @create 2018-01-17:47
 */

public class DispatherCoreService {
    private static  DispatherCoreService dispatherCoreService = null;

    public static Message getService(RestTemplate restTemplate, Message mes) {
        Map<String,String> map =mes.getExecuteMap();
        LinkedHashMap<String,String> executeMap =new LinkedHashMap();
        executeMap.putAll(map);
        map.clear();

        String key ="",value="";
        for (Map.Entry<String, String> entry : executeMap.entrySet()) {
            value=StaticMes.getStaticMes(entry.getValue());
            key=entry.getKey();
            String returnStr = restTemplate.postForEntity(value + key, mes, String.class).getBody();
            mes = JSON.parseObject(returnStr, new TypeReference<Message>() {});
        }
        executeMap.clear();
        return mes;
    }

    DispatherCoreService() {

    }

    public static DispatherCoreService getDispatherCoreService() {
        synchronized (dispatherCoreService) {
            if (dispatherCoreService == null) {
                dispatherCoreService = new DispatherCoreService();
            }
        }
        return dispatherCoreService;
    }
}
