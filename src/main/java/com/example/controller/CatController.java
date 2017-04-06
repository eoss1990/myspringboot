package com.example.controller;

import com.example.bean.Cat;
import com.example.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangyu on 2017/1/18.
 */
@RestController
@RequestMapping("/cat")
public class CatController {

    @Autowired
    private CatService catService;

    @RequestMapping("/findCat")
    public Cat findCat(int id){
        return catService.findCatById(id);
    }

    @RequestMapping("/exception")
    public String throwException() throws Exception {
        throw new Exception("错误啦");
    }
}
