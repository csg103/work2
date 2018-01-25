package com.xxx;

import java.util.Date;

/**
 * 基础VO
 *
 * @author csg
 * @create 2018-01-23:12
 */

public class BaseVO {

    private String c_interface_id;

    private String c_Interface_version;
    //请求类型
    private String c_request_type;
    //请求时间
    private Date  D_date_tIme;
    //请求渠道
    private String c_channel;
    //请求IP
    private String c_request_ip;
    //成功信息
    private String c_success_mes;
    //失败信息
    private String c_fail_mes;

    private String c_request_url;

    public String getC_interface_id() {
        return c_interface_id;
    }

    public void setC_interface_id(String c_interface_id) {
        this.c_interface_id = c_interface_id;
    }

    public String getC_Interface_version() {
        return c_Interface_version;
    }

    public void setC_Interface_version(String c_Interface_version) {
        this.c_Interface_version = c_Interface_version;
    }

    public String getC_request_type() {
        return c_request_type;
    }

    public void setC_request_type(String c_request_type) {
        this.c_request_type = c_request_type;
    }

    public Date getD_date_tIme() {
        return D_date_tIme;
    }

    public void setD_date_tIme(Date d_date_tIme) {
        D_date_tIme = d_date_tIme;
    }

    public String getC_channel() {
        return c_channel;
    }

    public void setC_channel(String c_channel) {
        this.c_channel = c_channel;
    }

    public String getC_request_ip() {
        return c_request_ip;
    }

    public void setC_request_ip(String c_request_ip) {
        this.c_request_ip = c_request_ip;
    }

    public String getC_success_mes() {
        return c_success_mes;
    }

    public void setC_success_mes(String c_success_mes) {
        this.c_success_mes = c_success_mes;
    }

    public String getC_fail_mes() {
        return c_fail_mes;
    }

    public void setC_fail_mes(String c_fail_mes) {
        this.c_fail_mes = c_fail_mes;
    }

    public String getC_request_url() {
        return c_request_url;
    }

    public void setC_request_url(String c_request_url) {
        this.c_request_url = c_request_url;
    }
}
