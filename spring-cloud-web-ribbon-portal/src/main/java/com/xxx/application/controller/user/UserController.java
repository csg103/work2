package com.xxx.application.controller.user;

import com.xxx.application.service.user.UserService;
import com.xxx.request.user.User_userMes;
import com.xxx.utils.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;

@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    UserService consumerService;


    @RequestMapping(value = "/user_add", method ={RequestMethod.POST,RequestMethod.GET})
    public String user_add(@RequestBody User_userMes user_userMes) throws ParseException {
        //VO模块引用
//        User_userMes user_userMes =new User_userMes();
        user_userMes.setTel("12345787");
        //util模块引用
        String aa= DataUtils.dateToStamp("1970-01-06 11:45:55");

        return consumerService.consumer(user_userMes);
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