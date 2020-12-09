package io.github.soheshts.Streams;

import io.github.soheshts.models.Person;
import io.github.soheshts.utils.BasicUtil;

import java.util.*;

/*
Author: Manju
Date: 9/12/2020
*/
public class DataManipulation {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(10,5,15);
        //Different ways to print list
        values.forEach(System.out::println);//method reference
        values.forEach(i -> System.out.println(i));//lambda expresion
        //Sort values in list
        values.sort(Comparator.naturalOrder());
        System.out.println(values);
        values.sort(Comparator.reverseOrder());
        System.out.println(values);

        //Sample String array sort
        List <String> stringData =Arrays.asList("hai","hello","world");
        stringData.sort(Comparator.naturalOrder());
        System.out.println(stringData);


        List<Person> person = BasicUtil.getPersonList();
        person.sort(Comparator.comparingInt(Person::getAge).reversed());

        //Simple Comparator sort -Based on surname/age
        person.sort(Comparator.comparing(Person::getSurName).reversed());
        System.out.println(person);

        //Filter based on person Age
        person.stream()
                .filter(p -> p.getAge() > 25)
                .forEach(p -> System.out.println(p));

         //Print user deatils if anyone age >27
        person.stream()
                .filter(p->p.getAge()>27)
                .findAny()
                .ifPresent(i->System.out.println(i));

        //Map
        Map<String, String> sampleMap = new HashMap<>();
        sampleMap.put("name", "Manju");
        sampleMap.put("seconName", "Mohan");
        sampleMap.put("age", "30");
        //Java 7
        Set<String> keySet = sampleMap.keySet();
        for (String s : keySet) {
            System.out.println(sampleMap.get(s));
        }
        //Java 8
        sampleMap.forEach((k,v)-> System.out.println(k));

        //List manipulation with stream
        //Get the twice of list values
        values.stream()
                .map(i->i*2)
                .forEach(i-> System.out.println(i));

        //Get the twice and then add
        System.out.println(values.stream()
                .map(i -> i * i)
                .reduce(0, (c, e) -> c + e));
    }
}
