package com.bonree.javalearning.functioninterface;

import java.util.function.Predicate;

/**
 * 断定式接口 Predicate boolean test(T) 返回只能是布尔值
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = str -> str.isBlank();
        System.out.println(predicate.test(""));
        System.out.println(95*13);
    }


}
