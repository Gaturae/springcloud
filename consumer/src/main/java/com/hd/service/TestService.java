package com.hd.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="producer")
public interface TestService {

    @RequestMapping("test")
    public String test();

}
