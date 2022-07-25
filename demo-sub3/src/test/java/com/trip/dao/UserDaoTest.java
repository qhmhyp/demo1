package com.trip.dao;

import com.trip.pojo.User;
import com.trip.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User userById = userDao.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }


}
