package com.xxx.application.controller;

import com.alibaba.fastjson.JSON;
import com.xxx.Message;
import com.xxx.core.dispatherCore.DispatherCoreServiceImpl;
import com.xxx.core.xmlAnalysis.XmlServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;


@RestController
@RequestMapping("/xml")
public class XmlController {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(XmlController.class);
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "/excte", method = RequestMethod.POST)
    public String excte( @RequestBody Message mes) throws Exception {
        LinkedHashMap<String, String> container;
        try {
            container = XmlServiceImpl.getXmlServiceImpl().ClassPathXmlApplicationContext_Service(mes);
        } catch (Exception e) {
            e.printStackTrace();
           throw e;
        }
        mes.setReturnflag(mes.getReturnflag()+"excte ");
        mes.setExecuteMap(container);
        mes = DispatherCoreServiceImpl.getDispatherCoreService().getService(restTemplate, mes);
        return JSON.toJSONString(mes);
    }





}
