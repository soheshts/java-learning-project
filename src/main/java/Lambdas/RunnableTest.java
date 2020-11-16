package Lambdas;

/*
Author: Sohesh TS
Date: 11/16/2020
*/
public class RunnableTest {
    public static void main(String[] args) {
        System.out.println("runnable test");
        /*Anonymous runnable class
        * No need to declare a new class to implement run()
         */
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Hello World one");
            }
        };
        /*
        * Lambda expression is used
        * (parameters) -> {body}
        * */
        Runnable r2 = () -> System.out.println("Hello World two");
        r1.run();
        r2.run();
    }
}
