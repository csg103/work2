package com.xxx.application.service;

import com.xxx.Message;

import java.util.Map;

/**
 * Created by csg on 2018/1/26.
 */
public interface XmlService {
    public Map<Integer, Map<String, String>> ClassPathXmlApplicationContext_Service(Message mes, Map<Integer, Map<String, String>> container)
            throws Exception ;
}
