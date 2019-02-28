package com.ddymen.dao;

import com.ddymen.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao {
    void insert(User user);
    void delete(int id);
    void update(User user);
    User selectById(int id);
    List<User> selectAll();

}
