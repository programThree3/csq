package com.bonree.javalearning.pattern.strategy;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 枚举和Map的方式来根据策略名称映射策略实现类，没有问题，
 * 但是使用spring 框架使用bean的名称就能找到对应的策略实现类
 */
@RestController
public class PayController {

    @Resource
    private ApplicationContext applicationContext;

    @RequestMapping("/pay")
    public PayResult pay(@RequestParam("amount") int amount,
                         @RequestParam("paymentType") String paymentType) {

        Order order = Order.builder()
                .amount(amount)
                .paymentType(paymentType)
                .build();

        // 根据支付类型获取相应策略 bean
        IPayment payment = applicationContext.getBean(order.getPaymentType(), IPayment.class);

        // 开始支付
        PayResult payResult = payment.pay(order);
        return payResult;
    }


}
