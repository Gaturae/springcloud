package com.hd.controller;

import com.hd.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    private TestService testService;


    @RequestMapping("test")
    public String test(){
        return testService.test();
    }
}
