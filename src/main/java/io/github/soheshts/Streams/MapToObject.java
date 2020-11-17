package io.github.soheshts.Streams;

import io.github.soheshts.models.Person;
import io.github.soheshts.utils.BasicUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Author: Sohesh TS
Date: 11/17/2020
*/
public class MapToObject {
    public static void main(String[] args) {
        List<Person> personList = BasicUtil.getPersonList();
        List<Person2> person2List = new ArrayList<>();
        person2List = personList.stream().map(person -> {
            Person2 person2 = new Person2();
            person2.setGivenName(person.getGivenName());
            person2.setSurName(person.getSurName());
            person2.setAge(person.getAge());
            return person2;
        }).collect(Collectors.toList());
        System.out.println(person2List);
    }



}
class Person2 {
    private String givenName;
    private String surName;
    private int age;

    public Person2(String givenName, String surName, int age) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
    }

    public Person2() {
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

    @Override
    public String toString() {
        return "Person2{" +
                "givenName='" + givenName + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}