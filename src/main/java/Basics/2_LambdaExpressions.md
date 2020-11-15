## Lambda Expressions
* Lambda expressions are the realization of functional programming principles in an object-oriented platform.
* Lambda expressions are used to express a function directly in code without the need of object-oriented wrappers to support them (from the language syntax point of view). In terms of methods, it can be viewed as an anonymous method.
* Since lambdas follow the semantics of a function, as in a functional programming language, they get all the parallelism and concurrency advantages that could be drawn from immmutable, consistent functions.
* Lambda expressions can be used in code wherever a functional interface is expected, which actually means that, internally, lambdas are implementations of functional interfaces and thus are first-class citizens in the language. They can be assigned/stored, passed as an argument, etc.
* Lambdas can replace anonymous classes if the anonymous class is an implementation of an interface that contains only one method (in such cases, the intent really is that you are trying to use a function as an argument), then the anonymous class can be replaced with a lambda, which would result in clean and less verbose code.

### Lambda Expression Syntax
* Specify function parameters, parameter type is optional, parenthesis can be omitted if there is only one parameter
* The arrow operator to separate the parameters and body
* Function body, parenthesis and return can be omitted if there is only one statement

#### Syntax examples:
* No parameter: `() →System.out.println(“Nothing”)`
* One parameter: `x →x+2`
* Two parameters: `(x,y) →x+y`
* With parameter types: `(Integer x, Integer y) →x+y`
* Multiple statements: 
    ```
  (x,y) -> {
    System.out.println(x);
    System.out.println(y);
    return x+y;
  }
  ```
  
