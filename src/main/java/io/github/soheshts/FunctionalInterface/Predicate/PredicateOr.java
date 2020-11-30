package io.github.soheshts.FunctionalInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Author: Sohesh TS
Date: 11/30/2020
*/
public class PredicateOr {
    public static void main(String[] args) {
        Predicate<String> lengthIs3 = x -> x.length() == 3;
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
//        or() same as logical or i.e ||
        list.stream().filter(lengthIs3.or(startWithA)).collect(Collectors.toList()).forEach(System.out::println);
    }
}
