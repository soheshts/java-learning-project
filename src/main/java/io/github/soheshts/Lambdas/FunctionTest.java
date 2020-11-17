package io.github.soheshts.Lambdas;

import io.github.soheshts.models.Person;
import io.github.soheshts.utils.BasicUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
Author: Sohesh TS
Date: 11/16/2020
*/
public class FunctionTest {
    public static void main(String[] args) {
        List<Person> personList = BasicUtil.getPersonList();
        // We can declare functions using Function interface and use apply() to execute it
        Function<Person, String> easternStyle = person -> {
            return person.getGivenName() + " " + person.getSurName();
        };

        Function<Person, String> westernStyle = person -> {
            return person.getSurName() + ", " + person.getGivenName();
        };

        System.out.println("----Eastern Style--------");
        personList.forEach(person -> System.out.println(person.printCustom(easternStyle)));
        System.out.println("----Western Style--------");
        personList.forEach(person -> System.out.println(person.printCustom(westernStyle)));
    }
}
