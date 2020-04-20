package com.southwind.controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/config")
public class ConfigController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return this.port;
    }
}
