package io.github.soheshts.utils;

import io.github.soheshts.models.Person;

import java.util.ArrayList;
import java.util.List;

/*
Author: Sohesh TS
Date: 11/17/2020
*/
public class BasicUtil {
    public static List<Person> getPersonList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Sohesh", "TS", 27));
        personList.add(new Person("Karthik", "PS", 28));
        personList.add(new Person("Manju", "Mohan", 40));
        personList.add(new Person("Garby", "Baby", 26));
        return personList;
    }
}
