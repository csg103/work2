package com.xxx.application.controller.user;

import com.alibaba.fastjson.JSON;
import com.xxx.Message;
import com.xxx.application.service.user.DispatherServiceImpl;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.ConnectException;
import java.util.Date;

@RestController
public class DispatcherAction {

    private static final Logger log = LoggerFactory.getLogger(DispatcherAction.class);

    @Autowired
    DispatherServiceImpl dispatherServiceImpl;

    /**
     *       请求参数    {"c_interface_id":"muslim_01","c_version":"csg11","c_channel":"产品"}
     *
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/excte", method = RequestMethod.POST)
    @ResponseBody
    public Message portalExcte(HttpServletRequest request, HttpServletResponse response, @RequestBody String strMes, HttpSession session) throws Exception {
        Date startTime = new Date();
        log.info("请求开始-------" + startTime);
        Message mes = dispatherServiceImpl.initRequestMessage(request);
        log.info("请求参数-------" + JSON.toJSONString(mes));
        mes = dispatherServiceImpl.initDataMes(mes, strMes);
        if (StringUtils.equals("false", mes.getReturnflag())) return mes;
        try {
            mes = dispatherServiceImpl.excte(mes);
        }catch (Exception e){
            e.printStackTrace();

        }
        Date endTime = new Date();
        log.info("返回参数---" + JSON.toJSONString(mes));
        log.info("请求结束耗时---" + (endTime.getTime() - startTime.getTime()));
        return mes;
    }
}