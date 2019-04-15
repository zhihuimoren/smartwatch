package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = "com.qf.config")
@MapperScan("com/qf/mapper")
@SpringBootApplication
public class SmartwatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartwatchApplication.class, args);
    }

}
