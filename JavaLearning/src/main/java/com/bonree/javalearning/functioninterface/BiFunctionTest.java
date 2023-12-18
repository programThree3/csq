package com.bonree.javalearning.functioninterface;

import java.util.function.BiFunction;

/**
 * BiFunction(T,U,R) 接受两个参数，并返回一个结果的函数
 */
public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> biFunction = (x, y) -> "x+y=" + x + y;
        BiFunction<Integer, Integer, Double> biFunction1 = (x, y) -> (x + y) * 0.2;
        System.out.println(biFunction.apply(1, 2));
        System.out.println(biFunction1.apply(1, 2));
    }
}
