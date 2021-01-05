package com.dv.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cl
 * @version 1.0 on 2020-11-14 18:42:00.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    public DemoController(){
        System.out.println("222");
    }
    @PostMapping("/getSomething")
    public Map<String, Object> getSomething(@RequestBody Map<String, Object> param) {
        Map<String, Object> result = new HashMap<>();
        List<Map> dataList = demoService.test(param.getOrDefault("id", "").toString());
        result.put("success", true);
        result.put("data", dataList);
        return result;
    }
}
