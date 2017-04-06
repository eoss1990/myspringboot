package com.example.service;

import com.example.bean.Cat;
import com.example.dao.CatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yangyu on 2017/1/18.
 */
@Service
public class CatService {

    @Autowired
    private CatDao catDao;

    public Cat findCatById(int id){
        return catDao.findOne(id);
    }
}
