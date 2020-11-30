package io.github.soheshts.FunctionalInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Author: Sohesh TS
Date: 11/30/2020
*/
public class Negate {
    public static void main(String[] args) {
        Predicate<String> startWithA = x -> x.startsWith("A");
        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
//        negate() will return false like !x.startsWith("A");
        list.stream().filter(startWithA.negate()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
