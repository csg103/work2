package com.xxx;

import java.util.Date;

/**
 * 基础VO
 *
 * @author csg
 * @create 2018-01-23:12
 */

public class BaseVO {

    private String interfaceName;
    //请求类型
    private String requestType;
    //请求时间
    private Date  dateTIme;
    //请求渠道
    private String channel;
    //请求IP
    private String requestIP;
    //成功信息
    private String successMes;
    //失败信息
    private String failMes;


    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public Date getDateTIme() {
        return dateTIme;
    }

    public void setDateTIme(Date dateTIme) {
        this.dateTIme = dateTIme;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRequestIP() {
        return requestIP;
    }

    public void setRequestIP(String requestIP) {
        this.requestIP = requestIP;
    }

    public String getSuccessMes() {
        return successMes;
    }

    public void setSuccessMes(String successMes) {
        this.successMes = successMes;
    }

    public String getFailMes() {
        return failMes;
    }

    public void setFailMes(String failMes) {
        this.failMes = failMes;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }
}
