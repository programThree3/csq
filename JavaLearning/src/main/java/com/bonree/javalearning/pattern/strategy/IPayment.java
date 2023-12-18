package com.bonree.javalearning.pattern.strategy;


/**
 * 策略
 * 支付接口
 */
public interface IPayment {

    PayResult pay(Order order);

}
