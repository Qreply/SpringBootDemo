package com.wd.demo.dao;

import com.wd.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Jpa提供了增删改查的功能
public interface IUserDao extends JpaRepository<User, Integer>{  //第一个泛型为实体类，第二个为实体类的主键类型

}
