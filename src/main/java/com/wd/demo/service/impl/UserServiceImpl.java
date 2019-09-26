package com.wd.demo.service.impl;

import com.wd.demo.dao.IUserDao;
import com.wd.demo.entity.User;
import com.wd.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;

    /**
     * 添加新用户
     * @param user
     */
    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    /**
     * 根据ID查找用户信息
     * @param id
     * @return
     */
    @Override
    public User findUserById(Integer id) {
        return userDao.getOne(id);
    }


    /**
     * 根据ID删除用户信息
     * @param id
     */
    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteById(id);
    }

}
