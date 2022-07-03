package com.shbai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Bai Shi hong
 * @create 2022-07-03 22:48
 * @description
 */
@SpringBootApplication
@EnableEurekaClient // 设置为服务注册中心
public class CloudEurekaServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001Application.class, args);
        System.out.println("启动成功");
    }
}
