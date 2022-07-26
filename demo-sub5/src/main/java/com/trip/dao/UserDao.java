package com.trip.dao;

import com.trip.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {

    int insertUser(User user);

    @Select("select * from user")
    User getUserById(@Param("id") int id);

    List<User> getUserByLimit(Map<String, Integer> map);

    int updateUser(User user);

    int deleteUser(int id);

}
