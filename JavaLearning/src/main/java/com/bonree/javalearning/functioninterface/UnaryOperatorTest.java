package com.bonree.javalearning.functioninterface;

import java.util.function.UnaryOperator;

/**
 * 一元运算符  T UnaryOperator<T>
 */
public class UnaryOperatorTest {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(10));

    }
}
