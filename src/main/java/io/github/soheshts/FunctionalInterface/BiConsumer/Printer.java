package io.github.soheshts.FunctionalInterface.BiConsumer;

import io.github.soheshts.models.Person;
import io.github.soheshts.utils.BasicUtil;

import java.util.List;
import java.util.function.BiConsumer;

/*
Author: Sohesh TS
Date: 12/5/2020
*/
public class Printer {
    //    BiConsumer as argument
    public static void main(String[] args) {
//        List<Person> persons = BasicUtil.getPersonList();
        printer(12, 6, (a1, a2) -> System.out.println(a1 + a2));
        printer("Sohesh", 27, (a1, a2) -> System.out.println(a1 + " (" + a2 + ")"));

    }

    static <T> void printer(T a1, T a2, BiConsumer<T, T> consumer) {
        consumer.accept(a1, a2);
    }
}
