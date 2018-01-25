package com.xxx.application.controller.user;

import com.xxx.Message;
import com.xxx.application.Adapter.ControllerInterceptor;
import com.xxx.application.service.user.DispatherService;
import com.xxx.request.user.User_userMes;
import com.xxx.utils.DataUtils;
import com.xxx.utils.IpUtil;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RestController
public class DispatcherAction {

    private static final Logger log = LoggerFactory.getLogger(DispatcherAction.class);

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DispatherService dispatherService;


    /**
     * 请求名字为titleId1的值的业务层xml代码，如titleId1的值为01，则会请求服务层的01.xml业务
     *
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/excte", method = RequestMethod.POST)
    @ResponseBody
    public Object portalExcte(HttpServletRequest request, HttpServletResponse response, @RequestBody String strMes, HttpSession session) throws Exception {
        Message mes = dispatherService.initRequestMessage(request);
        mes = dispatherService.initDataMes(mes,strMes);
        log.info(strMes);
        if(StringUtils.isEmpty(mes.getC_interface_id())||StringUtils.isEmpty(mes.getC_Interface_version())||StringUtils.isEmpty(mes.getC_channel())){
            return null;
        }else{
            dispatherService.excte(mes);
            return null;
        }

    }



    @RequestMapping(value = "/user_add", method = {RequestMethod.POST, RequestMethod.GET})
    public String user_add(@RequestBody User_userMes user_userMes) throws ParseException {
        //VO模块引用
//        User_userMes user_userMes =new User_userMes();
        user_userMes.setTel("12345787");
        //util模块引用
        String aa = DataUtils.dateToStamp("1970-01-06 11:45:55");

//        return consumerService.consumer(user_userMes);
        return null;
    }

    @RequestMapping(value = "/order_add", method = RequestMethod.GET)
    public String order_add() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE-ORDER/order_add?a=10&b=20", String.class).getBody();
    }

    @RequestMapping(value = "/pay_add", method = RequestMethod.GET)
    public String pay_add() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE-PAY/pay_add?a=10&b=20", String.class).getBody();
    }

    @RequestMapping(value = "/product_add", method = RequestMethod.GET)
    public String product_add() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE-PRODUCT/product_add?a=10&b=20", String.class).getBody();
    }

}