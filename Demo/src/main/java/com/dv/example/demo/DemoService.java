package com.dv.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cl
 * @version 1.0 on 2020-11-14 18:46:00.
 */
@Service("demoService")
public class DemoService {

    @Autowired
    private DemoDAO demoDAO;


    public List<Map> test(String id) {
        Map<String, Object> condition = new HashMap<>();
        List<Map> list = demoDAO.selectList(condition);
        return list;
    }
}
