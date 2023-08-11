package day17oop;
/*
1) Interfaces have "abstract methods," "abstract methods" are incomplete, that's why Java does not let us create
an object from interface just like abstract class.
2) "abstract class" is a class that is why it has "constructor" but this constructor cannot be used to create
Interface on the other hand is NOT a class, so it does not have a constructor at all
2) All methods in an interface MUST be overridden by concrete child class. That's why
interfaces are called as "to-do list"
 */
public interface Engine {
    void start();// all methods in interfaces are "public" and "abstract" so we don't have to declare them

    void stop();
    //Concrete Methods
    static void accelerate(){
        System.out.println("Increase the speed..");
    }
    default void price(){
        System.out.println("Every engine should have a price..");}

        //Variables in interfaces
        //1) Interface have "final" variables and "final variables' must be initialized.
        //                  "final variables" cannot be updated, they are final
        //                   "final variables" should be written in bold
        //2) all variables in an interface are "public," "final"
        public String engineNAme= "Electrical engine";





}
