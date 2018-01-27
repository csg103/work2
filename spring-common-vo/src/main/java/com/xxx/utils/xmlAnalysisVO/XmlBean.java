package com.xxx.utils.xmlAnalysisVO;

/**
 * bean节点解析VO
 *
 * @author csg
 * @create 2018-01-16:00
 */

public class XmlBean {

    private String  id;
    private String  serviceName;
    private String  expression;
    private String  method;
    private String  className;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
