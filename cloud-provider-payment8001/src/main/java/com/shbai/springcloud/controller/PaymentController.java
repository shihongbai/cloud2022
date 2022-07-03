package com.shbai.springcloud.controller;

import com.shbai.springcloud.entities.CommonResult;
import com.shbai.springcloud.entities.Payment;
import com.shbai.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Bai Shi hong
 * @create 2022-07-02 19:01
 * @description 控制层业务代码
 */
@RestController
@RequestMapping("payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;


    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("get/{id}")
    public CommonResult<Payment> selectOne(@PathVariable("id") Long id) {
        Payment payment = this.paymentService.queryById(id);

        return new CommonResult<Payment>(200, "select success， serverPort：" + serverPort, payment);
    }


}
