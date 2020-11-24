* Explain Final keyword in java?
 

Final keyword in java is used to restrict usage of variable, class and method.
 
Variable: Value of Final variable is constant, you can not change it.
Method: you can’t override a Final method.
Class: you can’t inherit from Final class.
---
* When is the super keyword used?
 
super keyword is used to refer:

immediate parent class constructor,
immediate parent class variable,
immediate parent class method.
---
* String vs String builder vs String buffer

You use String when an immutable structure is appropriate; obtaining a new character sequence from a String may carry an unacceptable performance penalty, either in CPU time or memory (obtaining substrings is CPU efficient because the data is not copied, but this means a potentially much larger amount of data may remain allocated).
You use StringBuilder when you need to create a mutable character sequence, usually to concatenate several character sequences together.
You use StringBuffer in the same circumstances you would use StringBuilder, but when changes to the underlying string must be synchronized (because several threads are reading/modifyind the string buffer). 

---

What is the difference between ‘throw’ and ‘throws’ in Java Exception Handling?
 

Following are the differences between two:

throw keyword is used to throw Exception from any method or static block whereas throws is used to indicate that which Exception can possibly be thrown by this method
If any method throws checked Exception, then caller can either handle this exception(using try catch block )or can re throw it by declaring another ‘throws’ clause in method declaration.
throw clause can be used in any part of code where you feel a specific exception needs to be thrown to the calling method
E.g.
throw
throw new Exception(“You have some exception”)
throw new IOException(“Connection failed!!”)
throws
throws IOException, NullPointerException, ArithmeticException

---
 
What is finalize() method?
 
Unlike c++ , we don’t need to destroy objects explicitly in Java. ‘Garbage Collector‘ does that automatically for us. Garbage Collector checks if no references to an object exist, that object is assumed to be no longer required, and the memory occupied by the object can be freed. Sometimes an object can hold non-java resources such as file handle or database connection, then you want to make sure these resources are also released before object is destroyed. To perform such operation Java provide protected void finalize() in object class. You can override this method in your class and do the required tasks. Right before an object is freed, the java run time calls the finalize() method on that object. Refer this for more details.

 
Difference in Set and List interface?
 

Set and List both are child interface of Collection interface. There are following two main differences between them

List can hold duplicate values but Set doesn’t allow this.
In List interface data is present in the order you inserted but in the case of Set insertion order is not preserved.

---

Difference in Set and List interface?
 

Set and List both are child interface of Collection interface. There are following two main differences between them

List can hold duplicate values but Set doesn’t allow this.
In List interface data is present in the order you inserted but in the case of Set insertion order is not preserved

---
Can we Overload or Override static methods in java?



Overriding : Overriding is related to run-time polymorphism. A subclass (or derived class) provides a specific implementation of a method in superclass (or base class) at runtime.
Overloading: Overloading is related to compile time (or static) polymorphism. This feature allows different methods to have same name, but different signatures, especially number of input parameters and type of input paramaters.
Can we overload static methods?   The answer is ‘Yes’. We can have two ore more static methods with same name, but differences in input parameters
Can we Override static methods in java?  We can declare static methods with same signature in subclass, but it is not considered overriding as there won’t be any run-time polymorphism. Hence the answer is ‘No’. Static methods cannot be overridden because method overriding only occurs in the context of dynamic (i.e. runtime) lookup of methods. Static methods (by their name) are looked up statically (i.e. at compile-time).

---
 What is “this” keyword in java?
Within an instance method or a constructor, this is a reference to the current object — the object whose method or constructor is being called. You can refer to any member of the current object from within an instance method or a constructor by using this.
Usage of this keyword

Used to refer current class instance variable.
To invoke current class constructor.
It can be passed as an argument in the method call.
It can be passed as argument in the constructor call.
Used to return the current class instance.
Used to invoke current class method (implicitly)
---

What is object cloning?
Object cloning means to create an exact copy of the original object. If a class needs to support cloning, it must implement java.lang.Cloneable interface and override clone() method from Object class. Syntax of the clone() method is :

protected Object clone() throws CloneNotSupportedException
If the object’s class doesn’t implement Cloneable interface then it throws an exception ‘CloneNotSupportedException’ .

---
Differences between HashMap and HashTable in Java.
1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
3. HashMap is generally preferred over HashTable if thread synchronization is not needed

---

Why is Java not pure Object-oriented?
Java is not considered pure Object-oriented because it supports primitive data-types such as boolean, byte, char, int, float, double, long, short.
---
What is Inheritance?

Inheritance means one class can extend to another class. So that the codes can be reused from one class to another class. The existing class is known as the Super class whereas the derived class is known as a sub class.

---

Encapsulation?

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

The fields of a class can be made read-only or write-only.

A class can have total control over what is stored in its fields.

---
What is Polymorphism?

Answer: Polymorphism means many forms.

A single object can refer to the super-class or sub-class depending on the reference type which is called polymorphism

---
What is meant by Method Overriding?

Answer: Method overriding happens if the sub-class method satisfies the below conditions with the Super-class method:

Method name should be the same
The argument should be the same
Return type should also be the same
The key benefit of overriding is that the Sub-class can provide some specific information about that sub-class type than the super-class.

---
What is meant by Overloading?

Method overloading happens for different classes or within the same class.

For method overloading, sub-class method should satisfy the below conditions with the Super-class method (or) methods in the same class itself:

Same method name
Different argument types
There may be different return types

---
Difference between Array and Array List.

Answer: The Difference between Array and Array List can be understood from the table below:

1. Size should be given at the time of array declaration.

String[] name = new String[2]	

Size may not be required. It changes the size dynamically.

ArrayList name = new ArrayList

2. To put an object into array we need to specify the index.
   
   name[1] = “book”	
   
   No index required.
   
   name.add(“book”)
   
---

Difference between Abstract class and Interface.

Answer: The differences between Abstract Class and Interface are as follows:

Abstract Class:

Abstract classes have a default constructor and it is called whenever the concrete subclass is instantiated.
It contains Abstract methods as well as Non-Abstract methods.
The class which extends the Abstract class shouldn’t require the implementation of all the methods, only Abstract methods need to be implemented in the concrete sub-class.
Abstract class contains instance variables.

Interface:

It doesn’t have any constructor and couldn’t be instantiated.
The abstract method alone should be declared.
Classes that implement the interface should provide the implementation for all the methods.
The interface contains only constants.

---

What is the meaning of Collections in Java?

Answer: Collection is a framework that is designed to store the objects and manipulate the design to store the objects.

Collections are used to perform the following operations:

Searching
Sorting
Manipulation
Insertion
Deletion
A group of objects is known as collections. All the classes and interfaces for collecting are available in Java util package.

---

What are all the Classes and Interfaces that are available in the collections?

Answer: Given below are the Classes and Interfaces that are available in Collections:

Interfaces:

Collection
List
Set
Map
Sorted Set
Sorted Map
Queue
Classes:

Lists:
Array List
Vector
Linked List
Sets:

Hash set
Linked Hash Set
Tree Set
Maps:

Hash Map
Hash Table
TreeMap
Linked Hashed Map
Queue:

Priority Queue

---
How do you make a thread in Java?

Answer: There are two ways available to make a thread.

a) Extend Thread class: Extending a Thread class and override the run method. The thread is available in java.lang.thread.

Example:
```
Public class Addition extends Thread {
public void run () {
}
}
```
The disadvantage of using a thread class is that we cannot extend any other classes because we have already extended the thread class. We can overload the run () method in our class.

b) Implement Runnable interface: Another way is by implementing the runnable interface. For that, we should provide the implementation for the run () method which is defined in the interface.

Example:
```
Public class Addition implements Runnable {
public void run () {
}
}
```

---

What is Synchronization?

Answer: Synchronization makes only one thread to access a block of code at a time. If multiple threads accesses the block of code, then there is a chance for inaccurate results at the end. To avoid this issue, we can provide synchronization for the sensitive block of codes.

The synchronized keyword means that a thread needs a key in order to access the synchronized code.

Locks are per objects. Every Java object has a lock. A lock has only one key. A thread can access a synchronized method only if the thread can get the key to the objects to lock.

For this, we use the “Synchronized” keyword.

Example:
```
public class ExampleThread implements Runnable{
 public static void main (String[] args){
 Thread t = new Thread ();
 t.start ();
 } 
 public void run(){
 synchronized(object){
 {
 }
}
```

---

What is meant by Serialization?

Answer: Converting a file into a byte stream is known as Serialization. The objects in the file are converted to bytes for security purposes. For this, we need to implement a java.io.Serializable interface. It has no method to define.

Variables that are marked as transient will not be a part of the serialization. So we can skip the serialization for the variables in the file by using a transient keyword.

---

