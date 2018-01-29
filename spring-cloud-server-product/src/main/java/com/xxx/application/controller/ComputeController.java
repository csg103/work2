package com.xxx.application.controller;

import com.alibaba.fastjson.JSON;
import com.xxx.Message;
import com.xxx.data.product.dao.mybatis.ProductMesMapper;
import com.xxx.data.product.entity.mybatis.ProductMes;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComputeController {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ComputeController.class);
    @Autowired
    private ProductMesMapper productMesMapper;
//    @Autowired
//    private DiscoveryClient client;

    @RequestMapping(value = "/product_add1", method = RequestMethod.POST)
    public String add( @RequestBody Message mes) {
        mes.setReturnflag(mes.getReturnflag()+"order_add1");
        log.info( JSON.toJSONString(mes));

        ProductMes productMes = new ProductMes();
        productMes.setProductId("123");
        productMesMapper.insert(productMes);
          return JSON.toJSONString(mes);
    }

}
