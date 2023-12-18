package com.bonree.javalearning.java11;

import java.util.Optional;
import java.util.stream.Collectors;

/**
 * java 11的String新特性
 */
public class StringTest {

    public static void main(String[] args) {
        // 判断字符串是否为空
        boolean blank = " " .isBlank();
        System.out.println("blank is " + blank);
        System.out.println("" .isBlank());
        // 去除首尾空格
        System.out.println(" java " .strip());
        // 去除首个空格
        System.out.println(" java " .stripLeading());
        // 去除尾部空格
        System.out.println(" java " .stripTrailing());
        // 重复字符串多次
        System.out.println("java" .repeat(4));
        // 返回由行终止符分隔的字符串集合
        System.out.println("A\nB\nC" .lines().count());
        System.out.println("A\nB\nC" .lines().collect(Collectors.toList()));

        // 判断指定的Optional对象是否为空
        Optional<Object> empty = Optional.empty();
        System.out.println(empty.isEmpty());
    }
}
