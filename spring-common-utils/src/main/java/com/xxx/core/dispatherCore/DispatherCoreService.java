package com.xxx.core.dispatherCore;

import com.xxx.Message;
import org.springframework.web.client.RestTemplate;

/**
 * Created by csg on 2018/1/28.
 */
public interface DispatherCoreService {
    public  Message getService(RestTemplate restTemplate, Message mes) ;
}
