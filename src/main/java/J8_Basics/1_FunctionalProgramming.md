# Functional Programming
> https://dzone.com/articles/j%CE%BBv%CE%BB-8-a-comprehensive-look?utm_source=DZone&utm_medium=article&utm_campaign=Java%208
### Functional Programming
Functional programming is a programming paradigm that dictates a different algorithmic way to think about problems and program solutions for them. T contrast it with object-oriented programming, in OOP, the primary abstraction is Class/Object, whereas in functional programming the primary abstraction is a function. As in OOP, objects form the building blocks for computation. Similarly, in functional programming, functions form the building blocks for computation.

In one line, "In functional programming, all computation is carried out through the execution of (mathematical) functions." These (mathematical) functions have the characteristic property of not changing any state and only operating on inputs, i.e there is no side-effect on their execution.

As we know, in an object-oriented programming, the primary unit is an object (defined by a class), which encapsulates the state and behavior of the object. Since everything is an object, to model a system or a solution, one has to always think and provide implementations based on objects. If there are cases where we need to implement only some behavior/operation and no state, OOP puts a constraint on wrapping that behavior in a Class to be able to execute that. This leads to too much boilerplate and verbose code where the computation just requires the execution of a function. Such scenarios are fairly simple and natural to handle in functional programming.

### Why Do We Need Functional Programming in Java?
* One of the biggest advantages of functional programming is that since computation/programs are expressed through (mathematical) functions, which do not change state or have any side effects and have the same output for each input, this fits naturally with concurrency and parallelism applicability. And as we are moving towards more cores and distributed/parallel computing, FP proves to be a more natural fit for such requirements. This is one of the reasons why functional languages or functional constructs are used to code AI/ML or big data solutions. Eg: Apache Spark is a big data platform coded in Scala, which is a (not purely) functional language. Another example is R, the most popular language amongst data scientists, which is functional.
* Following functional style tends to result in declarative code that is more concise and readable.
* Also since the code is to be written as mere functions without considering state, synchronization, and other concerns, one can focus more on the problem rather than code and its structuring itself.

### Anonymous Classes
Anonymous classes in Java are classes with no name. They are just syntactic sugar to avoid having boilerplate code to declare and instantiate a class that is only required for one-time use.

* It is an inner or local class without a name and for which only a single object is created.
* Anonymous classes are expressions, which means that the class needs to be defined in another statement.
* Anonymous class expression requires the new operator, the name of an interface to implement or a class to extend, parentheses that contain the arguments to a constructor, and a class declaration body.
* It cannot have constructors (instance initializers are used instead, as required)
* Since anonymous classes are like local classes, they also support capturing variables (they behave like closures — a closure is a block of code that can be referenced and passed around with access to the variables of the enclosing scope).
* Only local variables that are final or effectively final can be accessed (this also applies to Lambdas – to be discussed later — and also falls along the principles of functional programming where state could be changed by a function if we assume an anonymous class is just used as a replacement of a block of code without any state).

