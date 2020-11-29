package io.github.soheshts.FunctionalInterface.BiFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/*
Author: Sohesh TS
Date: 11/29/2020
*/
public class NumberTest {
    public static void main(String[] args) {
//        Calculate sum of integers
        BiFunction<Integer,Integer,Integer> adder = (no1, no2) -> no1 +no2;
        System.out.println("Sum: "+adder.apply(5,6));
//        Calculate power
        BiFunction<Integer,Integer,Double> powered = (no1, no2) -> Math.pow(no1,no2);
        System.out.println("Power: " + powered.apply(2,3));
//        return a list
        BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2, x1*x2);
        System.out.println("List: "+ func3.apply(2,3));

    }
}
