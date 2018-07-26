package com.offcn.dao;

import java.util.List;

import com.offcn.pojo.Orders;
import com.offcn.pojo.User;

public interface UserDao {
    public List<Orders> getOrdersUser1();
    public User findUserById(int id);
    public void insertUser(User user) ;
}
