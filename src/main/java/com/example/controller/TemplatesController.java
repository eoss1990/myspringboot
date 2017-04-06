package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yangyu on 2017/1/18.
 */
@Controller
@RequestMapping("/templates")
public class TemplatesController {

    /**
     * thymeleaf使用html
     * @param model
     * @return
     */
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","杨宇");
        return "hello";
    }

    /**
     * freemarker使用.ftl
     * @param model
     * @return
     */
    @RequestMapping("/helloftl")
    public String helloftl(Model model){
        model.addAttribute("name","林灵");
        return "helloftl";
    }

    @RequestMapping("/exception")
    public String throwException() throws Exception {
        throw new Exception("异常");
    }
}
