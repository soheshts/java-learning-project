package io.github.soheshts.FunctionalInterface.BiPredicate;

import io.github.soheshts.models.Person;
import io.github.soheshts.utils.BasicUtil;

import java.util.List;
import java.util.function.BiPredicate;

/*
Author: Sohesh TS
Date: 12/5/2020
*/
public class LengthTest {
    public static void main(String[] args) {
        BiPredicate<String, Integer> equalLength = (x,y) -> x.length() == y;
        List<Person> personList = BasicUtil.getPersonList();
//      .test() ->  Evaluates this predicate on the given arguments.
        personList.stream().filter(person -> equalLength.test(person.getGivenName(),5)).forEach(System.out::println);
    }
}
