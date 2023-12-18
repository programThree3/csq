package com.bonree.javalearning.pattern.strategy;

import org.springframework.stereotype.Service;

/**
 * 支付宝
 */
@Service("Alipay")
public class Alipay implements IPayment {

    @Override
    public PayResult pay(Order order) {
        return new PayResult("支付成功, 总金额 " + order.getAmount()  + " 支付类型 " + order.getPaymentType() );
    }
}
