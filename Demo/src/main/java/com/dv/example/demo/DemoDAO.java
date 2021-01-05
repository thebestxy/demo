package com.dv.example.demo;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author cl
 * @version 1.0 on 2020-11-14 18:46:00.
 */
@Repository("demoDAO")
public interface DemoDAO {


    List<Map> selectList(Map<String, Object> condition);
}
