package com.trip.dao;

import com.trip.pojo.User;

import java.util.List;

public interface UserDao {

    List<User> getUserList();

    int insertUser(User user);

    User getUserById(int id);

    int updateUser(User user);

    int deleteUser(int id);

}
