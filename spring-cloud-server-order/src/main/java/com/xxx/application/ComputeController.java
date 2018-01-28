package com.xxx.application;

import com.alibaba.fastjson.JSON;
import com.xxx.Message;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComputeController {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ComputeController.class);
//    @Autowired
//    private  DiscoveryClient client;



    @RequestMapping(value = "/order_add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
//        List<ServiceInstance> instance = client.getInstances("compute-service");
        Integer r = a - b;
       // logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return 1;
    }
    @RequestMapping(value = "/order_add1", method = RequestMethod.POST)
    public String add( @RequestBody Message mes) {
        mes.setReturnflag(mes.getReturnflag()+"order_add1");
        log.info( JSON.toJSONString(mes));
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        return JSON.toJSONString(mes);
    }

}