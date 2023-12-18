package com.bonree.javalearning.equal;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class EqualTest {
    public static void main(String[] args) {
        Person zhangsan = Person.builder()
                .name("zhangsan")
                .age(18)
                .build();
        Person lisi = Person.builder()
                .name("lisi")
                .age(20)
                .build();
        Set<Person> set1 = new HashSet<>();
        set1.add(zhangsan);
        set1.add(lisi);

        Set<Person> set2 = new HashSet<>();
        set2.add(zhangsan);
        set2.add(lisi);

        if (set1.contains(set2)) {
            log.info("set1 equal set2");
        } else {
            log.info("set1 is not equal set2");
        }

    }
}
