package com.xxx.application;

import com.alibaba.fastjson.JSON;
import com.xxx.Message;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComputeController {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ComputeController.class);

    @RequestMapping(value = "/user_add1", method = RequestMethod.POST)
    public String add( @RequestBody Message mes) {
        mes.setReturnflag(mes.getReturnflag()+"user_add1");
        log.info( JSON.toJSONString(mes));
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return JSON.toJSONString(mes);
    }

    @RequestMapping(value = "/user_add2", method = RequestMethod.POST)
    public String add2( @RequestBody Message mes) {
        log.info( JSON.toJSONString(mes));
        mes.setReturnflag(mes.getReturnflag()+"user_add2");
//        try {
//            Thread.sleep(10000L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return JSON.toJSONString(mes);
    }

    @RequestMapping(value = "/user_add3", method = RequestMethod.POST)
    public String add3( @RequestBody Message mes) {
        mes.setReturnflag(mes.getReturnflag()+"user_add3");
        log.info( JSON.toJSONString(mes));
//        try {
//            Thread.sleep(10000L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return JSON.toJSONString(mes);
    }
}
