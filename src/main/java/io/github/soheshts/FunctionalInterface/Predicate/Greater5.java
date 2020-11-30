package io.github.soheshts.FunctionalInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Author: Sohesh TS
Date: 11/30/2020
*/
public class Greater5 {
    public static void main(String[] args) {
        Predicate<Integer> greaterThan5 = x-> x > 5;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> newList = list.stream().filter(greaterThan5).collect(Collectors.toList());
        newList.forEach(System.out::println);
    }
}
