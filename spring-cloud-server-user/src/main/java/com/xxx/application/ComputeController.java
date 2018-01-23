package com.xxx.application;

import com.alibaba.fastjson.JSON;
import com.xxx.databasevo.user.User_userMes;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComputeController {
    private final Logger logger = Logger.getLogger(getClass());
//    @Autowired
//    private DiscoveryClient client;

    @RequestMapping(value = "/user_add", method = RequestMethod.POST)

    public String add( @RequestBody User_userMes userMes) {
        String tel =userMes.getTel();
//        ServiceInstance instance = client.getLocalServiceInstance();
//        Integer r = a + b?
//        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return JSON.toJSONString(userMes);
    }
}
