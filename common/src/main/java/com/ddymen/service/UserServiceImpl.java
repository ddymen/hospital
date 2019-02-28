package com.ddymen.service;

import com.ddymen.dao.UserDao;
import com.ddymen.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class UserServiceImpl implements UserService{


    private UserDao userDao;

    public void add(User user){
        userDao.insert(user);
    }
    public void remove(int id){
        userDao.delete(id);
    }
    public void edit(User user){
        userDao.update(user);
    }
    public User get(int id){
        return userDao.selectById(id);
    }
    public List<User> getAll(){
        return userDao.selectAll();
    }

}
