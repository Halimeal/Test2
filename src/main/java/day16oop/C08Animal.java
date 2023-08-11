package day16oop;
/*
1) If a method has a method body, it's called "concrete method"
if a method does not have a body it is called "abstract method"
2) To make a method abstract;
i) remove the method body
ii) use "abstract" keyword between access modifier and data type
iii)make the class abstract as well, because abstract methods can be put into an
abstract class only.
Note: abstract class can have concrete methods
3) When you create an abstract method, all the "concrete child classes" "must override"
the abstract method
But if parent class has "concrete methods", it is not mandatory to override.
 */

public abstract class C08Animal {
    public abstract void eat();
    public void drink(){
        System.out.println("Animals drink...");
    }

}
