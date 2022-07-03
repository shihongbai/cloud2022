package com.shbai.springcloud.service.impl;

import com.shbai.springcloud.dao.PaymentDao;
import com.shbai.springcloud.entities.Payment;
import com.shbai.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Bai Shi hong
 * @create 2022-07-02 19:13
 * @description
 */
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public Payment queryById(Long id) {
        return this.paymentDao.queryById(id);
    }

    @Override
    public List<Payment> queryAllByLimit(int offset, int limit) {
        return this.paymentDao.queryAllByLimit(offset, limit);
    }

    @Override
    public Payment insert(Payment payment) {
        this.paymentDao.insert(payment);
        return payment;
    }

    @Override
    public Payment update(Payment payment) {
        this.paymentDao.update(payment);
        return this.queryById(payment.getId());
    }

    @Override
    public boolean deleteById(Long id) {
        return this.paymentDao.deleteById(id) > 0;
    }
}
