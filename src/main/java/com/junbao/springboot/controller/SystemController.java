package com.junbao.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SystemController {

    @RequestMapping("/")
    public String index() {
        return "system/index";
    }
}
