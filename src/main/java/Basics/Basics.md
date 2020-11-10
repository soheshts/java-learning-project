# Basics
> https://dzone.com/articles/j%CE%BBv%CE%BB-8-a-comprehensive-look?utm_source=DZone&utm_medium=article&utm_campaign=Java%208
### Functional Programming
Functional programming is a programming paradigm that dictates a different algorithmic way to think about problems and program solutions for them. T contrast it with object-oriented programming, in OOP, the primary abstraction is Class/Object, whereas in functional programming the primary abstraction is a function. As in OOP, objects form the building blocks for computation. Similarly, in functional programming, functions form the building blocks for computation.

In one line, "In functional programming, all computation is carried out through the execution of (mathematical) functions." These (mathematical) functions have the characteristic property of not changing any state and only operating on inputs, i.e there is no side-effect on their execution.

As we know, in an object-oriented programming, the primary unit is an object (defined by a class), which encapsulates the state and behavior of the object. Since everything is an object, to model a system or a solution, one has to always think and provide implementations based on objects. If there are cases where we need to implement only some behavior/operation and no state, OOP puts a constraint on wrapping that behavior in a Class to be able to execute that. This leads to too much boilerplate and verbose code where the computation just requires the execution of a function. Such scenarios are fairly simple and natural to handle in functional programming.
