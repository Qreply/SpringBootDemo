package com.wd.demo.service;

import com.wd.demo.entity.User;

public interface IUserService {

    /**
     * 添加新用户
     * @param user
     */
    void addUser(User user);

    /**
     * 根据ID查找用户信息
     * @param id
     * @return
     */
    User findUserById(Integer id);

    /**
     * 根据ID删除用户信息
     * @param id
     */
    void deleteUserById(Integer id);
}
