package com.example.gamingtech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.gamingtech.mapper")
public class GamingTechApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamingTechApplication.class, args);
    }

}
