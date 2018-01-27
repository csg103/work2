package com.xxx.core.xmlAnalysis;

import com.xxx.Message;

import java.util.LinkedHashMap;

/**
 * Created by csg on 2018/1/26.
 */
public interface XmlService {
     LinkedHashMap<String, String> ClassPathXmlApplicationContext_Service(Message mes)
            throws Exception ;
}
