package com.bonree.javalearning.pattern.strategy;

import org.springframework.stereotype.Service;

/**
 * 微信支付
 */
@Service("WechatPay")
public class WechatPay implements IPayment {

    @Override
    public PayResult pay(Order order) {
        return new PayResult("支付成功, 总金额 " + order.getAmount()  + " 支付类型 " + order.getPaymentType() );
    }
}
