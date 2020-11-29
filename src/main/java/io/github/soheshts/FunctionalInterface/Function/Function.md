##Function 
> https://mkyong.com/java8/java-8-function-examples/  

 In Java 8, Function is a functional interface; it takes an argument (object of type T) and returns an object (object of type R). The argument and output can be a different type.
 
 ####General Syntax
 ```
Function<T,R> functionName = input -> {
body
}
```
Call `functionName.apply()` to execute the function.
