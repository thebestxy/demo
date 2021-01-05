package com.dv.controller;

import com.dv.po.User;
import com.dv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getSomething")
    public List<User> getSomething() {
        List<User> users = userService.selectAll();
        return users;
    }
    @GetMapping("/getUser/username={username}&&password={password}")
    public User getUser(@PathVariable String username,@PathVariable String password){
        User user = userService.selectOne(username);
        String pass = user.getPassword();
        System.out.println(pass);
        String salt = user.getSalt();
        System.out.println(salt);
        String base = password+salt;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        if(pass.equals(md5)){
            System.out.println("密码输入正确");
            return user;
        }
        return null;
    }

}
