package com.bonree.javalearning.map;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Slf4j
public class ComputeIfAbsentTest {
    static Map<String, Set<String>> hashmap = new HashMap<>();

    /**
     * 没有用到computeIfAbsent方法, 通过hashmap判断key是否存在
     */
    public static void noComputeIfAbsent() {
        Set<String> set = new HashSet<>();
        set.add("zhangSan");
        hashmap.put("china", set);
        // hashmap中存在key，直接入value； 否则创建一个新的value的数据结构
        if (hashmap.containsKey("china")) {
            hashmap.get("china").add("lisi");
        } else {
            HashSet<String> setTmp = new HashSet<>();
            setTmp.add("lisi");
            hashmap.put("china", setTmp);
        }
        log.info("no computeIfAbsent output map is {}", hashmap);
    }

    /**
     * 用最新的computeIfAbsent方法
     */
    public static void computeIfAbsentTest() {
        Set<String> set = new HashSet<>();
        set.add("zhangSan");
        hashmap.put("china", set);
        // after JDK 1.8
        hashmap.computeIfAbsent("china", key -> new HashSet<>()).add("lisi");
        // 表示<K,V> value不存在，直接创建V
        log.info(" hashmap.computeIfAbsent(\"china\", key -> new HashSet<>()) is {}", hashmap.computeIfAbsent("china", key -> new HashSet<>()));
        log.info("after JDK 1.8 computeIfAbsent output map is {}", hashmap);

    }

    public static void main(String[] args) {
        noComputeIfAbsent();
        computeIfAbsentTest();
    }
}
