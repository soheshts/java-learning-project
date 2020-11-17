package io.github.soheshts.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Author: Sohesh TS
Date: 11/17/2020
*/
public class MapToUpper {
    public static void main(String[] args) {
        List<String> lowerCase = Arrays.asList("a","b","c","d","e");
        List<String> upperCase = new ArrayList<>();
        /*
        * Here, we take each list item , map it to uppercase
        * and collect them as a List
        * */
        upperCase = lowerCase.stream().map(String::toUpperCase).collect(Collectors.toList());
        upperCase.forEach(System.out::println);

        //Extra,
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println(numbers.stream().map(n -> n*2).collect(Collectors.toList()));


    }
}
