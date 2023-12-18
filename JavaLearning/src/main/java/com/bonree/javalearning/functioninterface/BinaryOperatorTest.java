package com.bonree.javalearning.functioninterface;

import java.util.function.BinaryOperator;

/**
 * 二元运算符 BinaryOperator<T>
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (x, y) -> x / y;
        System.out.println("binaryOperator.apply(3,4) = " + binaryOperator.apply(3, 4));
    }
}
