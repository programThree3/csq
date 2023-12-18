package com.bonree.javalearning.pattern.strategy;

import lombok.Builder;
import lombok.Data;

/**
 * 订单信息
 */
@Data
@Builder
public class Order {

    /**
     * 金额
     */
    private int amount;

    /**
     * 支付类型
     */
    private String paymentType;
}
