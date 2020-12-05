package io.github.soheshts.models;


import java.util.function.Function;

/*
Author: Sohesh TS
Date: 11/17/2020
*/
public class Person {
    private String givenName;
    private String surName;
    private int age;

    public Person(String givenName, String surName, int age) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
    }

    public String printCustom(Function<Person, String> f) {
        return f.apply(this);
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
        return "Person{" +
                "givenName='" + givenName + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}