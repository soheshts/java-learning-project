package io.github.soheshts.FunctionalInterface.Consumer;

import io.github.soheshts.models.Person;
import io.github.soheshts.utils.BasicUtil;

import java.util.List;
import java.util.function.Consumer;

/*
Author: Sohesh TS
Date: 12/5/2020
*/
public class ConsumerTwo {
    public static void main(String[] args) {
        List<Person> persons = BasicUtil.getPersonList();
        Consumer<String> printer = word -> System.out.println(word);
        persons.forEach(person -> printer.accept(person.getSurName()));
    }
}
