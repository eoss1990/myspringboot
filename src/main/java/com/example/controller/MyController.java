package com.example.controller;

import com.example.bean.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yangyu on 17/1/11.
 */
@Controller
@RequestMapping("/")
public class MyController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String test(@PathVariable String name){
        logger.info(name);
        return "hello world "+name;
    }

    @RequestMapping("/json")
    @ResponseBody
    public People json(){
        People people = new People();
        people.setId(111);
        people.setName("yangyu");
        return people;
    }
}
