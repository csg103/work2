package com.xxx.staticMes;

public class StaticMes {
    public static final String XMLSERVICE = "http://COMPUTE-SERVICE-XML/";
    public static final String ACCOUNTSERVICE = "http://COMPUTE-SERVICE-ACCOUNT/";
    public static final String ORDERSERVICE = "http://COMPUTE-SERVICE-ORDER/";
    public static final String PAYSERVICE = "http://COMPUTE-SERVICE-PAY/";
    public static final String PRODUCTSERVICE = "http://COMPUTE-SERVICE-PRODUCT/";
    public static final String USERSERVICE = "http://COMPUTE-SERVICE-USER/";


    public static String getStaticMes(String str) {
        switch (str) {
            case XMLSERVICE:
                return XMLSERVICE;
            case ACCOUNTSERVICE:
                return ACCOUNTSERVICE;
            case ORDERSERVICE:
                return ORDERSERVICE;
            case PAYSERVICE:
                return PAYSERVICE;
            case PRODUCTSERVICE:
                return PRODUCTSERVICE;
            case USERSERVICE:
                return USERSERVICE;
            default:
                return "";


        }

    }
}

