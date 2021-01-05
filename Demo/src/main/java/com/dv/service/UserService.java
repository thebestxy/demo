package com.dv.service;

import com.dv.dao.UserDAODAO;
import com.dv.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserDAODAO userDAODAO;

    public List<User> selectAll(){
        List<User> users = userDAODAO.selectAll();
        return users;
    }
    public User selectOne(String username){
        User user = userDAODAO.selectOne(username);
        return user;
    }

    public  User updateLoginNum(String username){
        User user = userDAODAO.updateLoginNum(username);
        return user;
    }

}
