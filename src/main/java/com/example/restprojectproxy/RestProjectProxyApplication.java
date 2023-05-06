package com.example.restprojectproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestProjectProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestProjectProxyApplication.class, args);
    }
}
