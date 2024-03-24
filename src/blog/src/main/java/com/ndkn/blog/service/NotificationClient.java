package com.ndkn.blog.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "stores",  url = "http://notification:9092/")
public interface NotificationClient {
    @RequestMapping(method = RequestMethod.GET, value = "/hello", consumes = "application/json")
    Map<String, String> invoke();
}
