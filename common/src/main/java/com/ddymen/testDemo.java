package com.ddymen;

import com.ddymen.dao.UserDao;
import com.ddymen.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testDemo {

    public static void main(String[] args) {
        SqlSession session=MybatisUtil.getSession();
        try {
            //通过MyBatis实现接口BookTypeDAO，返回实例
            UserDao userDao = session.getMapper(UserDao.class);
            User user = new User();
            user.setUsername("ddymen");
            user.setPassword("waterloo");
            userDao.insert(user);
            System.out.println(userDao.selectAll());
            User user1 = userDao.selectById(1);
            user1.setPassword("cn00396257");
            userDao.update(user1);
            System.out.println(userDao.selectAll());
            userDao.delete(1);
            System.out.println(userDao.selectAll());
        } finally {
            session.close();
        }
    }




}
