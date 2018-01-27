package com.xxx.staticMes;

public class StaticMes {
    private static final String XMLSERVICE = "http://COMPUTE-SERVICE-XML/";
    private static final String ACCOUNTSERVICE = "http://COMPUTE-SERVICE-ACCOUNT/";
    private static final String ORDERSERVICE = "http://COMPUTE-SERVICE-ORDER/";
    private static final String PAYSERVICE = "http://COMPUTE-SERVICE-PAY/";
    private static final String PRODUCTSERVICE = "http://COMPUTE-SERVICE-PRODUCT/";
    private static final String USERSERVICE = "http://COMPUTE-SERVICE-USER/";


    public static String getStaticMes(String str) {
        switch (str) {
            case "XMLSERVICE":
                return XMLSERVICE;
            case "ACCOUNTSERVICE":
                return ACCOUNTSERVICE;
            case "ORDERSERVICE":
                return ORDERSERVICE;
            case "PAYSERVICE":
                return PAYSERVICE;
            case "PRODUCTSERVICE":
                return PRODUCTSERVICE;
            case "USERSERVICE":
                return USERSERVICE;
            default:
                return "";


        }

    }
}

