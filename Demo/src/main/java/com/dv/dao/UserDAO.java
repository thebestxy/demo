package com.dv.dao;

import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@ResponseBody

public class UserDAO {


    public static HashMap<String, ArrayList> getUsers() throws IOException {
        Properties properties = new Properties();
        HashMap map = new HashMap();
        InputStream inStream =  ClassLoader.getSystemResourceAsStream("application.properties");
        //读取properties文件
        properties.load(inStream);
        //获取值传入键 properties.get();获取用户名和密码
        Set<String> strings = properties.stringPropertyNames();
        //迭代器获取键值然后遍历properties
        Iterator<String> it = strings.iterator();
        while (it.hasNext()) {
            ArrayList list = new ArrayList();
            //获取每一个键然后判断是否与用户名相同 有一个问题 如果用户名和密码相同会触发
            String zhanghao = it.next();
            if ("id".equals(zhanghao.substring(zhanghao.length() - 2, zhanghao.length()))) {
                String user = (String) properties.getProperty(zhanghao);
                String mima = zhanghao.substring(0, zhanghao.length() - 2) + "password";
                String yan = zhanghao.substring(0, zhanghao.length() - 2) + "salt";
                String yaoshi = zhanghao.substring(0, zhanghao.length() - 2) + "key";
                String n = zhanghao.substring(0, zhanghao.length() - 2) + "n";
                //顺序加入
                String pass = (String)properties.getProperty(mima);
                String salt = (String)properties.getProperty(yan);
                String key = (String)properties.getProperty(yaoshi);
                int num = Integer.parseInt(properties.getProperty(n));
                //加入list集合
                list.add(pass);
                list.add(salt);
                list.add(key);
                list.add(num);
                //加入map
                map.put(user,list);
            }
        }
        return map;
    }
}
