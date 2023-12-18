package com.bonree.javalearning.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * flatmap测试
 */
@Slf4j
public class Parcel {

    String name;

    List<String> items;

    public Parcel(final String name, final String... items) {
        this.name = name;
        this.items = Arrays.asList(items);
    }

    public List<String> getItems() {
        return items;
    }

    public static void main(String[] args) {
        final Parcel amazon = new Parcel("amazon", "Laptop", "Phone");
        final Parcel ebay = new Parcel("ebay", "mouse", "KeyBoard");
        List<Parcel> parcels = Arrays.asList(amazon, ebay);

        log.info("------------------------without flatmap()------------------------------------");
        List<List<String>> mapReturn = parcels.stream()
                .map(Parcel::getItems)
                .collect(Collectors.toList());
        log.info("------------------------\t collect() return: " + mapReturn);

        log.info("\n------------------------with flatmap()------------------------------------");
        List<String> flatMapReturn = parcels.stream()
                .map(Parcel::getItems)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        log.info("\t collect() return : " + flatMapReturn);

    }
}
