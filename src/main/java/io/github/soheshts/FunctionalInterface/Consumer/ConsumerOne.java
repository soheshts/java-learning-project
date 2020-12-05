package io.github.soheshts.FunctionalInterface.Consumer;

import java.util.function.Consumer;

/*
Author: Sohesh TS
Date: 12/5/2020
*/
public class ConsumerOne {
    public static void main(String[] args) {
        Consumer<String> printer = word -> System.out.println(word);
        printer.accept("BlahBlah");
    }
}
