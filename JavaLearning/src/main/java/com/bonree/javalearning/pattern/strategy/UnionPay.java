package com.bonree.javalearning.pattern.strategy;

import org.springframework.stereotype.Service;

/**
 * 银联支付 支付方式类都用了@Service注解生成bean放入Spring bean容器中，使用策略模式就不用的new 支付对象了
 * 可以直接使用bean,更符合业务场景
 */
@Service("UnionPay")
public class UnionPay implements IPayment {

    @Override
    public PayResult pay(Order order) {
        return new PayResult("支付成功, 总金额 " + order.getAmount()  + " 支付类型 " + order.getPaymentType() );
    }
}
