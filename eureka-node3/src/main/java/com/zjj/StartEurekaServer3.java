package com.zjj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StartEurekaServer3 {
    public static void main(String[] args) {
        System.out.println("注册中心3启动了！！！");
        SpringApplication.run(StartEurekaServer3.class);
    }
}