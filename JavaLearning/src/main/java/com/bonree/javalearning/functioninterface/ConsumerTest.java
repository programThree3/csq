package com.bonree.javalearning.functioninterface;

import java.util.function.Consumer;

/**
 * 消费型接口
 * 只有输入没有返回值 Consumer void accept(T)
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("123");
    }
}
