package Lambdas;

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
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Sohesh", "TS", 27));
        personList.add(new Person("Karthik", "PS", 28));
        personList.add(new Person("Manju", "Mohan", 40));
        personList.add(new Person("Garby", "Baby", 26));

        //Anonymous class way
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return  o1.getGivenName().compareTo(o2.getGivenName());
            }
        });
        personList.forEach((person)-> System.out.println(person.getGivenName()));
        Collections.shuffle(personList);
        System.out.println("-----------Just Shuffling for demo----------------");
        personList.forEach((person)-> System.out.println(person.getGivenName()));
        System.out.println("---------------------------------------------------");
        //Lambda way
        System.out.println("------------Lambda Sorted--------------------------");
        Collections.sort(personList,(Person p1, Person p2)-> p1.getGivenName().compareTo(p2.getGivenName()));
        personList.forEach((person)-> System.out.println(person.getGivenName()));

    }
}

class Person {
    private String givenName;
    private String surName;
    private int age;

    public Person(String givenName, String surName, int age) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}