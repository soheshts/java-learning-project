List down the new features introduced in Java 8?

Answer: New features that are introduced in Java 8 are enlisted below:

Lambda Expressions
Method References
Optional Class
Functional Interface
Default methods
Nashorn, JavaScript Engine
Stream API
Date API

---

What are Functional Interfaces?

Answer: Functional Interface is an interface that has only one abstract method. The implementation of these interfaces is provided using a Lambda Expression which means that to use the Lambda Expression, you need to create a new functional interface or you can use the predefined functional interface of Java 8.

The annotation used for creating a new Functional Interface is “@FunctionalInterface”.

---

What is an optional class?

Answer: Optional class is a special wrapper class introduced in Java 8 which is used to avoid NullPointerExceptions. This final class is present under java.util package. NullPointerExceptions occurs when we fail to perform the Null checks.

> https://www.baeldung.com/java-optional
---

What are the main characteristics of the Lambda Function?

Answer: Main characteristics of the Lambda Function are as follows:

A method that is defined as Lambda Expression can be passed as a parameter to another method.
A method can exist standalone without belonging to a class.
There is no need to declare the parameter type because the compiler can fetch the type from the parameter’s value.
We can use parentheses when using multiple parameters but there is no need to have parenthesis when we use a single parameter.
If the body of expression has a single statement then there is no need to include curly braces.

---
What is Method Reference?

Answer: In Java 8, a new feature was introduced known as Method Reference. This is used to refer to the method of functional interface. It can be used to replace Lambda Expression while referring to a method.

For Example: If the Lambda Expression looks like

num -> System.out.println(num)
Then the corresponding Method Reference would be,

System.out::println
where “::” is an operator that distinguishes class name from the method name.

---

What is a Stream API? Why do we require the Stream API?

Answer: Stream API is a new feature added in Java 8. It is a special class that is used for processing objects from a source such as Collection.

We require the Stream API because,

It supports aggregate operations which makes the processing simple.
It supports Functional-Style programming.
It does faster processing. Hence, it is apt for better performance.
It allows parallel operations.

---



