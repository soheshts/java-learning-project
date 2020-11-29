package io.github.soheshts.FunctionalInterface.Function;

import java.util.function.Function;

/*
Author: Sohesh TS
Date: 11/29/2020
*/
public class WordLength {
    public static void main(String[] args) {
        /*
        * 'Function' is a functional interface.
        * Call functionName.apply() to execute the function.
        * */
        Function<String, Integer> lengthify = word-> word.length();
        System.out.println(lengthify.apply("sohesh"));
    }
}
