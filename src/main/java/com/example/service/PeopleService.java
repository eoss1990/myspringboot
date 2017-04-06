package com.example.service;

import com.example.bean.People;
import com.example.dao.PeopleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yangyu on 2017/1/12.
 */
@Service
public class PeopleService {

    @Autowired
    private PeopleDao peopleDao;

    @Transactional
    public void save(People people){
        peopleDao.save(people);
    }

    @Transactional
    public void delete(int id){
        peopleDao.delete(id);
    }

    public Iterable<People> findAll(){
        return peopleDao.findAll();
    }

    public Page findAll(Pageable pageable){
        return peopleDao.findAll(pageable);
    }

    public People findByNameUseQuery(String name){
        return peopleDao.findPeopleByName(name);
    }

    public People findByNameUseJpa(String name){
        return peopleDao.findByName(name);
    }
}
