package com.xxx.application.service.user;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xxx.BaseVO;
import com.xxx.request.user.User_userMes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class UserService {

        @Autowired
        RestTemplate restTemplate;

        @HystrixCommand(fallbackMethod = "fallback")
        public String consumer(BaseVO user_userMes) {
            User_userMes User_userMes =  (User_userMes)user_userMes;
          String tel =  User_userMes.getTel();
            return restTemplate.postForEntity("http://COMPUTE-SERVICE-USER/user_add",user_userMes, String.class).getBody();
        }
    public String fallback(BaseVO user_userMes) {
        return "fallback";
    }


    }