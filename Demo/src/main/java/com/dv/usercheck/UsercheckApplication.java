package com.dv.usercheck;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.dv","com.corearchi.utils"})
@MapperScan(basePackages = "com.dv.dao")
public class UsercheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsercheckApplication.class, args);
    }

}
