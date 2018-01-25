package com.xxx;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 基础VO
 *
 * @author csg
 * @create 2018-01-23:12
 */

public class Message<T> extends BaseVO{

    private String c_interface_id;
    private String userId;
    //客户端发送的参数对象

    //为0表示执行异常，其他为正常执行
    private String returnflag ="1";
    private Map<String, T> returnMapObjectMes=new HashMap();
    //服务器端返回的信息，字符串类型
    private Map<String, String> returnMapStringMes=new HashMap();

    //服务器端返回的信息，list类型  
    private Map<String, List<T>> retrunMapListMes=new HashMap();

    private Map<String, T>  reqMapObjectMes=new HashMap();
    //服务器端返回的信息，字符串类型
    private Map<String, String> reqMapStringMes=new HashMap();

    //服务器端返回的信息，list类型  
    private Map<String, List<T>> reqMapListMes=new HashMap();

    private Map<String,Boolean> executeflag =new HashMap();

    //在业务层用于xml判断 是否执行当前服务。当在a=0时跳过当前服务，可在次map中增加map(a,0). 并在xml中配置节点 <bean executeFlag="mes.getExecuteflag()" >


    public Map<String, Boolean> getExecuteflag() {
        return executeflag;
    }

    public void setExecuteflag(Map<String, Boolean> executeflag) {
        this.executeflag = executeflag;
    }

    @Override
    public String getC_interface_id() {
        return c_interface_id;
    }

    @Override
    public void setC_interface_id(String c_interface_id) {
        this.c_interface_id = c_interface_id;
    }

    public Map<String, T> getReqMapObjectMes() {
        return reqMapObjectMes;
    }

    public void setReqMapObjectMes(Map<String, T> reqMapObjectMes) {
        this.reqMapObjectMes = reqMapObjectMes;
    }

    public Map<String, String> getReqMapStringMes() {
        return reqMapStringMes;
    }

    public void setReqMapStringMes(Map<String, String> reqMapStringMes) {
        this.reqMapStringMes = reqMapStringMes;
    }

    public Map<String, List<T>> getReqMapListMes() {
        return reqMapListMes;
    }

    public void setReqMapListMes(Map<String, List<T>> reqMapListMes) {
        this.reqMapListMes = reqMapListMes;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }



    public String getReturnflag() {
        return returnflag;
    }

    public void setReturnflag(String returnflag) {
        this.returnflag = returnflag;
    }

    public Map<String, T> getReturnMapObjectMes() {
        return returnMapObjectMes;
    }

    public void setReturnMapObjectMes(Map<String, T> returnMapObjectMes) {
        this.returnMapObjectMes = returnMapObjectMes;
    }

    public Map<String, String> getReturnMapStringMes() {
        return returnMapStringMes;
    }

    public void setReturnMapStringMes(Map<String, String> returnMapStringMes) {
        this.returnMapStringMes = returnMapStringMes;
    }

    public Map<String, List<T>> getRetrunMapListMes() {
        return retrunMapListMes;
    }

    public void setRetrunMapListMes(Map<String, List<T>> retrunMapListMes) {
        this.retrunMapListMes = retrunMapListMes;
    }



    public Message() {

    }
}
