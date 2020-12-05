package io.github.soheshts.FunctionalInterface.BiConsumer;

import io.github.soheshts.models.Person;
import io.github.soheshts.utils.BasicUtil;

import java.util.List;
import java.util.function.BiConsumer;

/*
Author: Sohesh TS
Date: 12/5/2020
*/
public class Adder {
    public static void main(String[] args) {
        List<Person> persons = BasicUtil.getPersonList();
//        Takes tow param and perform ops. Returns nothing
        BiConsumer<String, Integer> printer = (name, age) -> System.out.println(name + "(" + age + ")");
        persons.forEach(person -> printer.accept(person.getGivenName(), person.getAge()));
    }
}
