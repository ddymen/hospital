package com.ddymen.service;

import com.ddymen.entity.User;

import java.util.List;

public interface UserService {
    public void add(User user);
    public void remove(int id);
    public void edit(User user);
    public User get(int id);
    public List<User> getAll();
}
