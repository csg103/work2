package com.xxx.application.Adapter;

import com.xxx.utils.IpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ControllerInterceptor implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(ControllerInterceptor.class);

    /**
     * 进入controller层之前拦截请求
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        log.info("---------------------开始进入请求地址拦截----------------------------");
        String requestUrl = httpServletRequest.getRequestURL().toString();//得到请求的URL地址
        String requestUri = httpServletRequest.getRequestURI();//得到请求的资源
        String remoteAddr = IpUtil.getIpAddr(httpServletRequest); //得到来访者的IP地址
        String remoteHost = httpServletRequest.getRemoteHost();
        int remotePort = httpServletRequest.getRemotePort();
        String remoteUser = httpServletRequest.getRemoteUser();
        String method = httpServletRequest.getMethod();//得到请求URL地址时使用的方法
        String pathInfo = httpServletRequest.getPathInfo();
        String localAddr = httpServletRequest.getLocalAddr();//获取WEB服务器的IP地址
        String localName = httpServletRequest.getLocalName();//获取WEB服务器的主机名
        HttpSession session = httpServletRequest.getSession();

        Map<String,String> parmMap=new HashMap<String,String>();
        //getParameterMap()，获得请求参数map

        Map<String,String[]> map= httpServletRequest.getParameterMap();
        //参数名称
        Set<String> key=map.keySet();
        //参数迭代器
        Iterator<String> iterator = key.iterator();
        while(iterator.hasNext()){
            String k=iterator.next();
            parmMap.put(k, map.get(k)[0]);
        }
        log.info("parmMap====="+parmMap.toString());


        //  基础数据验证 如果渠道未明确，可直接返回false
//        validateMes();
        if (!StringUtils.isEmpty(session.getAttribute("userName"))) {
            return true;
        } else {
           // PrintWriter printWriter = httpServletResponse.getWriter();
          //  printWriter.write("{code:0,message:\"session is invalid,please login again!\"}");
            return true;
        }
    }
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        log.info("--------------处理请求完成后视图渲染之前的处理操作---------------");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        log.info("---------------视图渲染之后的操作-------------------------0");
    }
}