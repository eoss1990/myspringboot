package com.example.controller;

import com.example.bean.People;
import com.example.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yangyu on 2017/1/12.
 */
@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @RequestMapping("/add/{id}/{name}")
    public People add(@PathVariable int id,@PathVariable String name){
        People people = new People();
        people.setId(id);
        people.setName(name);
        peopleService.save(people);
        return people;
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        peopleService.delete(id);
        return "删除成功！";
    }

    @RequestMapping("/findAll")
    public List<People> findAll(){
        List<People> list = (List<People>) peopleService.findAll();
        return list;
    }

    /**
     * 分页查询，默认从第0页开始
     * @return
     */
    @RequestMapping(value="/findByPage")
    public List<People> findAllByPage(){
        PageRequest pageRequest = new PageRequest(2,5);
        Page<People> page = peopleService.findAll(pageRequest);
        return page.getContent();
    }

    @RequestMapping("/findByNameUseQuery")
    public People findByName(String name){
        return peopleService.findByNameUseQuery(name);
    }

    @RequestMapping("/fingByNameUseJpa")
    public People findByNameUseJpa(String name){
        return peopleService.findByNameUseJpa(name);
    }
}
