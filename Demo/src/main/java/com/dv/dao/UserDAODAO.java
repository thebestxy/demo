package com.dv.dao;

import com.dv.po.User;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@ResponseBody
public interface UserDAODAO {
    List<Map> selectList(Map<String, Object> condition);
    List<User> selectAll();
    User selectOne(String username);
    User updateLoginNum(String username);
}
