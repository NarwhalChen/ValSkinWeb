package com.example.valskin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = "com.example.valskin.module")
public class ValSkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValSkinApplication.class, args);
    }

}
