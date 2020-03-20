package com.lsp.demo3lsp.controller;

import com.lsp.demo3lsp.bean.Information;
import com.lsp.demo3lsp.bean.SystemInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    private Information information;

    @Autowired
    private SystemInfo systemInfo;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Springboot!";
    }

    @RequestMapping("/info")
    public Information info(){
        return information;
    }

    @RequestMapping("/sys")
    public SystemInfo sys(){
//        String name = systemInfo.getName();
//        String password = systemInfo.getPassword();
        return  systemInfo;
    }
}
