package com.xzzy.essp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xzzy.essp.mapper")
public class EsspApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsspApplication.class, args);
    }

}
