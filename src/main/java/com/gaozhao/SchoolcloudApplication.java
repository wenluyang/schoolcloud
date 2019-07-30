package com.gaozhao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gaozhao.app_dao.**")
public class SchoolcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolcloudApplication.class, args);
    }

}
