package com.xxx.application.controller;

import com.alibaba.fastjson.JSON;
import com.xxx.Message;
import com.xxx.application.service.XmlService;
import com.xxx.request.user.User_userMes;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.script.ScriptException;
import java.io.IOException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


@RestController
public class XmlController {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private XmlService xmlService   ;
    private static final String IFELEMENT = "if";
    private static final String BEANELEMENT = "bean";
    @RequestMapping(value = "/excte", method = RequestMethod.POST)
    public Message excte( @RequestBody Message mes) {
        Map<Integer, Map<String, String>> container = new ConcurrentHashMap<Integer, Map<String, String>>();
	    container.clear();
        try {
            container = ClassPathXmlApplicationContext_Service(mes,container);
        } catch (Exception e) {
            e.printStackTrace();
            mes.setC_fail_mes("业务异常");
            return mes;
        }
        return null;
    }

    /**
     * 读取对应的业务xml 并把服务名字加载到container
     * @throws Exception
     */
    public Map<Integer, Map<String, String>> ClassPathXmlApplicationContext_Service(Message mes,Map<Integer, Map<String, String>> container)
            throws Exception {
        String interfaceId = mes.getC_interface_id();
        String filename= "business/Bussiness_"+ interfaceId + ".xml";
        SAXBuilder sb = new SAXBuilder();
        Document doc = sb.build(this.getClass().getClassLoader()
                .getResourceAsStream(filename));
        Element root = doc.getRootElement();
        List<Element> list = root.getChildren("bean");
        for (Element element : list) {
            String id = element.getAttributeValue("id");
            String clazz = element.getAttributeValue("class");
            String executeFlag = element.getAttributeValue("executeFlag");
            String[] excuteFlag = executeFlag.split(":");
            mes.getExecuteflag().get("");
            Map<String, String> map = new HashMap<String, String>();
            map.put(id, clazz);
//            container.put(i, map);
        }
        return container;
    }


}
