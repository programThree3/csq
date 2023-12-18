package com.bonree.javalearning.functioninterface;

import java.util.function.Function;

/**
 * function接口 Function<T,R> 传入参数T，返回参数R
 */
public class FunctionTest {
    public static void main(String[] args) {
        Function<String, String> function = str -> str;
        System.out.println(function.apply("asd"));
    }

}
