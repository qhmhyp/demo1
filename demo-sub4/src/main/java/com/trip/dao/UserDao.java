package com.trip.dao;

import com.trip.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    int insertUser(User user);

    User getUserById(int id);

    List<User> getUserByLimit(Map<String,Integer> map);

    int updateUser(User user);

    int deleteUser(int id);

}
