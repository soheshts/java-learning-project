package io.github.soheshts.FunctionalInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Author: Sohesh TS
Date: 11/30/2020
*/
public class PredicateAnd {
    public static void main(String[] args) {
        Predicate<Integer> greater5 = x -> x > 5;
        Predicate<Integer> lessThan8 = x -> x < 8;
        Predicate<Integer> greater5Even = x -> x > 5 && x % 2 == 0;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // and() used for multiple conditions
        List<Integer> newList = list.stream().filter(greater5.and(lessThan8)).collect(Collectors.toList());
        newList.forEach(System.out::println);
        List<Integer> evenList = list.stream().filter(greater5Even).collect(Collectors.toList());
        System.out.println("Even > 5");
        evenList.forEach(System.out::println);
    }
}
