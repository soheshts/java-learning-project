package io.github.soheshts.Streams;

import io.github.soheshts.models.Person;
import io.github.soheshts.utils.BasicUtil;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
Author: Sohesh TS
Date: 11/17/2020
*/
public class StreamTest1 {
    public static void main(String[] args) {
        //get list of persons
        List<Person> personList = BasicUtil.getPersonList();
        //filter out the personList with persons having age 27 and save it into a list
        List<Person> result = personList.stream().filter(person -> person.getAge() == 27).collect(Collectors.toList());
        //print the list of persons having age 27
        result.forEach(person -> System.out.println(person.getGivenName()));

        //findAny() ond orElse() example
        Person result2 = personList.stream().filter(person -> person.getAge() == 26)
                .findAny().orElse(null);
        if (result2 != null) {
            System.out.println("-------------------------\n" + result2.getGivenName());
        }
        //findAny()  example
        Optional<Person> result3 = personList.stream().filter(person -> person.getAge() == 24)
                .findAny();
        System.out.println(result3.isPresent());

        //filter and map.
        //map only 'given name'
        System.out.println("--------------------------------------------");
        String name = personList.stream().filter(person -> person.getAge() == 40).map(person -> person.getGivenName())
                .findAny().orElse("Name not found");
        System.out.println(name);

    }
}
