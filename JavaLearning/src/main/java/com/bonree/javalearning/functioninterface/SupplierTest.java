package com.bonree.javalearning.functioninterface;

import java.util.function.Supplier;

/**
 * 供给型接口 Supplier T get()
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 1024;
        System.out.println(supplier.get());
    }
}
