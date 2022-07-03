package com.shbai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Bai Shi hong
 * @create 2022-07-04 0:25
 * @description
 */
@SpringBootApplication
@EnableEurekaServer // 设置为服务注册中心 EurekaServer
public class CloudEurekaServer7002Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7002Application.class, args);
        System.out.println("启动成功");
    }
}
