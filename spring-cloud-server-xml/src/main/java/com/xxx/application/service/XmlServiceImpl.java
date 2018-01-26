package com.xxx.application.service;

import com.xxx.Message;
import org.apache.commons.lang.StringUtils;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class XmlServiceImpl implements XmlService {
    private static final Logger log = LoggerFactory.getLogger(XmlServiceImpl.class);
    /**
     * 读取对应的业务xml 并把服务名字加载到container
     * @throws Exception
     */
    public Map<Integer, Map<String, String>> ClassPathXmlApplicationContext_Service(Message mes, Map<Integer, Map<String, String>> container)
            throws Exception {
        Map map= new HashMap();
        map.put("inta",9);
mes.setExecuteflag(map);
        String interfaceId = mes.getC_interface_id();
        String filename= "bussiness/Bussiness_"+ interfaceId + ".xml";
        SAXBuilder sb = new SAXBuilder();
        Document doc = null;
        try {
            InputStream ins= this.getClass().getClassLoader()
                    .getResourceAsStream(filename);
             doc = sb.build(ins);
        }catch (MalformedURLException e){
           // log.error("bussiness **.xml文件读取失败 ，请检查c_interface_id名是否正确！");
            throw e;
        }
        Element root = doc.getRootElement();
        List<Element> list = root.getChildren("bean");
        for (Element element : list) {
            String id = element.getAttributeValue("id");
            String clazz = element.getAttributeValue("class");
            String executeFlag = element.getAttributeValue("expression");
          boolean   executeflag = getexecuteFlag(mes,executeFlag);
            String[] excuteFlag = executeFlag.split(":");
            mes.getExecuteflag().get("");
//            Map<String, String> map = new HashMap<String, String>();
//            map.put(id, clazz);
//            container.put(i, map);
        }
        return container;
    }

  private Boolean   getexecuteFlag(Message mes,String executeFlag) throws Exception {
        Map map = mes.getExecuteflag();
        String[] args;
      int  key =-1;
      int value =-1;
              Boolean flag =false;
        switch (getCondition(executeFlag)){
            case "<" :
                args=executeFlag.split("<");
                 key = (Integer) mes.getExecuteflag().get(args[0]);
                value =Integer.valueOf(args[1]).intValue();
                flag =key<value;
                break;
            case ">":
                args=executeFlag.split(">");
                 key = (Integer) mes.getExecuteflag().get(args[0]);
                value =Integer.valueOf(args[1]).intValue();
                flag =key>value;
                break;
            case "=":
                args=executeFlag.split("=");
                 key = (Integer) mes.getExecuteflag().get(args[0]);
                 value =Integer.valueOf(args[1]).intValue();
                flag =key==value;
                break;
            case "0":
                throw new Exception("bussiness 表达式配置错误，目前只支持  >  <  = Int类型比较！！！");
        }
      if(key==-1||value ==-1){
          throw new Exception("配置表达式的同时需要 在mes.getExecuteflag的map中设置相应的 key value值 用于比较！");
      }

      return flag;
  }
       private String  getCondition(String executeFlag){
          return executeFlag.contains(">") ?">" : executeFlag.contains("<") ?"<":executeFlag.contains("=") ?"=":"0";
       }

}
