package io.github.soheshts.FunctionalInterface.Function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/*
Author: Sohesh TS
Date: 11/29/2020
*/
public class AsParameter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one","two","three","four","five");
        Map<String,Integer> lengthMap = AsParameter.toMap(words, x-> x.length());
        lengthMap.forEach((k,v)-> System.out.println("Word: " + k + " Length: " +v));
        //Lets pass a different function
        lengthMap = AsParameter.toMap(words, x-> x.length() * 2);
        lengthMap.forEach((k,v)-> System.out.println("--Word: " + k + " Length X 2: " +v));
    }
    /*
    * T,R is a generic type.
    * You need to decalre it first before using.
    * like the one after 'static'
    * */
    public static <T, R>  Map<T, R> toMap(List<T> words, Function<T,R> function){
        Map<T, R> returnMap = new HashMap<>();
        words.forEach(word -> {
            returnMap.put(word, function.apply(word));
        });
        return returnMap;
    }

}
