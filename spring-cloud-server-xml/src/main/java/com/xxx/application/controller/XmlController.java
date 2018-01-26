package com.xxx.application.controller;

import com.xxx.Message;
import com.xxx.application.service.XmlService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@RestController
public class XmlController {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private XmlService xmlService   ;
    private static final String IFELEMENT = "if";
    private static final String BEANELEMENT = "bean";
    @RequestMapping(value = "/excte", method = RequestMethod.POST)
    public String excte( @RequestBody Message mes) {
        Map<Integer, Map<String, String>> container = new ConcurrentHashMap<Integer, Map<String, String>>();
	    container.clear();
        try {
            container = xmlService.ClassPathXmlApplicationContext_Service(mes,container);
        } catch (Exception e) {
            e.printStackTrace();
            mes.setC_fail_mes("业务异常");
            return null;
        }
        return null;
    }





}
