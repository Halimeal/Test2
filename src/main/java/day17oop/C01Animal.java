package day17oop;
/*
1) Java does not let us create an object from "abstract class".
Because "abstract class" has "abstract methods" which are not complete(do not have method body).
If a method is incomplete, it cannot create perfect objects which cannot perform their task in the application
To avoid this issue, Java does not allow the object creation.
2) If an abstract method is overridden by concrete child class, child class of that concrete child class may or
 may not have to override the abstract method.
 30 It is mandatory to override abstract methods for "concrete child classes", if the child is abstract it is optional
 for that class to override the method.
 4)"Abstract classes" can have "abstract method" as well as concrete methods,
 "concrete classes cannot have "abstract methods" in them.
 "Concrete classes can have only "concrete methods".
 5) "abstract methods" can use "public", "protected" and "default" access modifiers
 but "abstract methods" cannot use "private access modifier"
 6) What is "final method"?
 "final method" is a method which cannot be updated.
 Can we make an abstract method "final"?
 "abstract methods" do not have body that is why "abstract methods" can not be declared final

 Can we override the "final methods"?
 "final methods" cannot be overridden because they don't accept change? update in the body
  which is the main purpose of overriding
  7) Can we make "abstract methods" "static"?
  An "abstract method" cannot be static.
  (abstract method is incomplete and cannot be implemented
  until a subclass provides a concrete implementation)

 */
public abstract class C01Animal {
    public abstract void eat();


}
