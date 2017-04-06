package com.example.dao;

import com.example.bean.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by yangyu on 2017/1/12.
 */

/**
 * 一般接口继承CrudRepository，增删改查
 * 或者继承PagingAndSortingRepository，可分页和排序
 * 直接继承JpaRepository可以具有所有方法
 */
public interface PeopleDao extends JpaRepository<People,Integer> {

    /**
     * 可以通过Query注解指定hql
     * @param name
     * @return
     */
    @Query("from People where  name=:name")
    public People findPeopleByName(@Param("name") String name);

    /**
     * 也可以通过By连接属性来查询，JPA会自动帮你生成sql
     * @param name
     * @return
     */
    public People findByName(String name);
}
