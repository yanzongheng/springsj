package com.a;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.a.dao")
public class SpringsjApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsjApplication.class, args);
    }

}
