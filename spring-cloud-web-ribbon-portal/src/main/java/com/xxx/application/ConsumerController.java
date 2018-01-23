package com.xxx.application;

import com.xxx.databasevo.user.User_userMes;
import com.xxx.utils.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;


    @RequestMapping(value = "/user_add", method = RequestMethod.GET)
    public String user_add() throws ParseException {
        User_userMes user_userMes =new User_userMes();
        user_userMes.setTel("12345787");
        String aa= DataUtils.dateToStamp("1970-01-06 11:45:55");
        return restTemplate.postForEntity("http://COMPUTE-SERVICE-USER/user_add",user_userMes, String.class).getBody();
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