package test.com.ddymen.service; 

import com.ddymen.MybatisUtil;
import com.ddymen.dao.UserDao;
import com.ddymen.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* UserServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>Feb 27, 2019</pre> 
* @version 1.0 
*/ 
public class UserServiceImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(User user) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: remove(int id) 
* 
*/ 
@Test
public void testRemove() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: edit(User user) 
* 
*/ 
@Test
public void testEdit() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: get(int id) 
* 
*/ 
@Test
public void testGet() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getAll() 
* 
*/ 
@Test
public void testGetAll() throws Exception {
    SqlSession session=MybatisUtil.getSession();
    try {
        //通过MyBatis实现接口BookTypeDAO，返回实例
        UserDao userDao = session.getMapper(UserDao.class);
        System.out.println(userDao.selectAll());
    } finally {
        session.close();
    }
} 


} 
