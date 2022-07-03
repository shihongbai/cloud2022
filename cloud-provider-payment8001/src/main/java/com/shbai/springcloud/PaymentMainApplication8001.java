package com.shbai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Bai Shi hong
 * @create 2022-07-02 18:23
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMainApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainApplication8001.class, args);
        System.out.println("启动成功");
    }
}

