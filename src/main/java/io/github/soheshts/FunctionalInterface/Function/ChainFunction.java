package io.github.soheshts.FunctionalInterface.Function;

import java.util.function.Function;

/*
Author: Sohesh TS
Date: 11/29/2020
*/
public class ChainFunction {
    public static void main(String[] args) {
        Function<String, Integer> lengthify = word-> word.length();
        Function<Integer, Integer> doubler = length-> length * 2;
        //Chained two function using 'andThen()'
        System.out.println(lengthify.andThen(doubler).apply("sohesh"));
    }
}
