package io.github.soheshts.Lambdas;

import io.github.soheshts.models.Person;
import io.github.soheshts.utils.BasicUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Author: Sohesh TS
Date: 11/16/2020
*/
public class ComparatorTest {
    public static void main(String[] args) {
        List<Person> personList = BasicUtil.getPersonList();

        //Anonymous class way
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getGivenName().compareTo(o2.getGivenName());
            }
        });
        personList.forEach((person) -> System.out.println(person.getGivenName()));
        Collections.shuffle(personList);
        System.out.println("-----------Just Shuffling for demo----------------");
        personList.forEach((person) -> System.out.println(person.getGivenName()));
        System.out.println("---------------------------------------------------");
        //Lambda way
        System.out.println("------------Lambda Sorted--------------------------");
        Collections.sort(personList, (Person p1, Person p2) -> p1.getGivenName().compareTo(p2.getGivenName()));
        personList.forEach((person) -> System.out.println(person.getGivenName()));

    }
}

