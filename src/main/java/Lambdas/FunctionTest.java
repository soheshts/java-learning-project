package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
Author: Sohesh TS
Date: 11/16/2020
*/
public class FunctionTest {
    public static void main(String[] args) {
        List<Personn> personList = new ArrayList<>();
        personList.add(new Personn("Sohesh", "TS", 27));
        personList.add(new Personn("Karthik", "PS", 28));
        personList.add(new Personn("Manju", "Mohan", 40));
        personList.add(new Personn("Garby", "Baby", 26));
        // We can declare functions using Function interface and use apply() to execute it
        Function<Personn, String> easternStyle = person -> {
            return person.getGivenName()+ " " + person.getSurName();
        };

        Function<Personn, String> westernStyle = person -> {
            return person.getSurName()+", "+person.getGivenName();
        };

        System.out.println("----Eastern Style--------");
        personList.forEach(person -> System.out.println(person.printCustom(easternStyle)));
        System.out.println("----Western Style--------");
        personList.forEach(person -> System.out.println(person.printCustom(westernStyle)));
    }
}
class Personn {
    private String givenName;
    private String surName;
    private int age;

    public Personn(String givenName, String surName, int age) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
    }
    public String printCustom(Function <Personn, String> f){
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
}