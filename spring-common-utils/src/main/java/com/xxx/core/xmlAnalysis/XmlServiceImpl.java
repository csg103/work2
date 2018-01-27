package com.xxx.core.xmlAnalysis;

import com.xxx.Message;
import com.xxx.utils.xmlAnalysisVO.XmlBean;
import com.xxx.utils.xmlAnalysisVO.XmlElement;
import org.apache.commons.lang.StringUtils;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class XmlServiceImpl implements XmlService {
    private static final Logger log = LoggerFactory.getLogger(XmlServiceImpl.class);
    private static  XmlServiceImpl xmlServiceImpl = new XmlServiceImpl();
    /**
     * 读取对应的业务xml 并把服务名字加载到container
     *
     * @throws Exception
     */
    public LinkedHashMap<String, String> ClassPathXmlApplicationContext_Service(Message mes)
            throws Exception {
        String interfaceId = mes.getC_interface_id();
        Document doc = getDocument(interfaceId);
        XmlElement xmlElement =  getXmlElement(doc);
        LinkedHashMap  map =    getContainer(mes,xmlElement);
        return  map;
    }
   private  LinkedHashMap<String, String>   getContainer(Message mes, XmlElement xmlElement) throws Exception {
       LinkedHashMap<String, String> beanmap = new  LinkedHashMap<>();
        List<XmlBean>  list = xmlElement.getXmlbean();
        String expression ;
        String executeFlag = "1";
        for(XmlBean xmlbean : list){
            expression =   xmlbean.getExpression();
                try {
                    executeFlag = getexecuteFlag(mes, expression);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            //executeflag  1表示未配置expression表达式，执行当前任务或表达式成功执行任务，0 表示不执行当前任务 2表示配置了表达式，但表达式配置中没有 > < =三者中的一个
            switch (executeFlag) {
                case "0":
                    break;
                case "1":
                    if(StringUtils.equals(beanmap.get(xmlbean.getMethod()),xmlbean.getServiceName())){
                        throw new Exception("请检查是否在相同的XML业务中配置了相同的服务--》"+xmlbean.getMethod());
                    }
                    beanmap.put(xmlbean.getMethod(),xmlbean.getServiceName());
                    break;
                case "2":
                    throw  new Exception("表达式配置错误！");
            }
        }
        return beanmap;
    }

 private XmlElement getXmlElement(Document doc ){
     Element root = doc.getRootElement();
     List<Element> list = root.getChildren("bean");
     XmlElement xmlElement =new XmlElement();
     List<XmlBean> xmlBeans =new LinkedList();
     for (Element element : list) {
         XmlBean xmlBean =new XmlBean();
         xmlBean.setMethod(element.getAttributeValue("method"));
         xmlBean.setServiceName(element.getAttributeValue("serviceName"));
         xmlBean.setExpression(element.getAttributeValue("expression"));
         xmlBean.setId(element.getAttributeValue("id"));
         xmlBean.setClassName(element.getAttributeValue("class"));
         xmlBeans.add(xmlBean);
     }
     xmlElement.setXmlbean(xmlBeans);
     return xmlElement;
    }
  private Document  getDocument(String interfaceId) throws JDOMException, IOException {
      String filename = "bussiness/Bussiness_" + interfaceId + ".xml";
      SAXBuilder sb = new SAXBuilder();
      Document doc = null;

          InputStream ins = this.getClass().getClassLoader()
                  .getResourceAsStream(filename);
      try {
          doc = sb.build(ins);
      } catch (JDOMException e) {
          log.error("xml解析失败！");
          e.printStackTrace();
          throw e;
      } catch (IOException e) {
          log.error("xml读取异常！");
          e.printStackTrace();
          throw e;
      }
      return doc;

  }

    private String getexecuteFlag(Message mes, String executeFlag) {
        Map map = mes.getExecuteflag();
        String[] args;
        int key = -1;
        int value = -1;
        String flag = "2";
        try{
        switch (getCondition(executeFlag)) {
            case "<":
                args = executeFlag.split("<");
                key = (Integer) mes.getExecuteflag().get(StringUtils.trim(args[0]));
                value = Integer.valueOf(StringUtils.trim(args[1])).intValue();
                flag = Boolean.toString(key < value);
                break;
            case ">":
                args = executeFlag.split(">");
                key = (Integer) mes.getExecuteflag().get(StringUtils.trim(args[0]));
                value = Integer.valueOf(StringUtils.trim(args[1])).intValue();
                flag = Boolean.toString(key > value);
                break;
            case "=":
                args = executeFlag.split("=");
                key = (Integer) mes.getExecuteflag().get(StringUtils.trim(args[0]));
                value = Integer.valueOf(StringUtils.trim(args[1])).intValue();
                flag = Boolean.toString(key == value);
                break;
            case "0":
                flag = "2";
                break;

        }}catch (IllegalArgumentException e){
           log.error("表达式格式为 <<expression =\"inta &gt; 18\" >> 确保 18为数字类型！当前表达式配置为---》"+executeFlag);
            return  "2";
        }catch (NullPointerException e){
            log.info("表达式格式为 expression =\"inta &gt; 18\"  确保  添加表达式的同时在Message.Executeflag中设置了相同key的条件用于比较！当前表达式配置为---》"+executeFlag);
            return  "1";
        }catch (Exception e){
            log.error("表达式配置错误，请检查表达式格式  expression =\"inta &gt; 18\" 当前表达式配置为---》"+executeFlag);
            return  "2";
        }
        if (key == -1 || value == -1) {
            log.info("配置表达式的同时需要 在mes.getExecuteflag的map中设置相应的 key value值 用于比较！当前表达式配置为---》"+executeFlag );
            return "1";
        }

        return flag == "2" ? "2" : Boolean.valueOf(flag) ? "1" : "0";
    }


    private String getCondition(String executeFlag) {
        return executeFlag.contains(">") ? ">" : executeFlag.contains("<") ? "<" : executeFlag.contains("=") ? "=" : "0";
    }
    public static XmlServiceImpl getXmlServiceImpl() {
        return xmlServiceImpl;
    }
}
