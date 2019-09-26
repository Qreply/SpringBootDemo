package com.wd.demo.controller;

import com.wd.demo.entity.User;
import com.wd.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 添加新用户
     * @return
     */
    @ResponseBody
    @RequestMapping("/save")
    public String saveUser(){
        User user = new User();
        user.setUserName("yyy");
        user.setUserPassword("12223");
        user.setUserAge(23);
        user.setUserPhone("1266658910");

        userService.addUser(user);
        return "success";
    }

    /**
     * 根据ID查找用户信息
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/find/{id}")
    public User findUserById(@PathVariable("id") Integer id){
        return userService.findUserById(id);
    }

    /**
     * 根据ID删除用户
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/delete/{id}")
    public String deleteUserById(@PathVariable Integer id){
        userService.deleteUserById(id);
        return "delete ok";
    }


}
