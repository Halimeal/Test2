package day16oop;
/*
1) The Method in child class(Overriding Method in parent class is called "Overridden Method")
Overriding Methods (Child Class) cannot use narrower access modifiers than those of
overridden Methods (Parents Class)

Overridden Methods => default
Overridden Methods=> default, protected, public

Overridden Methods => protected
Overridden Methods=>  protected, public

Overridden Methods => private
Overridden Methods=> Private method cannot be overridden

Polymorphism= Method Overloading+ Method Overriding
2) What's the difference between Method Overloading and Method Overriding?(Interview question)
i) "Method Overloading" occurs in the same class while "Method Overriding" needs
multiple classes
ii) "Method Overriding" needs inheritance whereas "Method Overloading" does not need this
iii) "private" methods can be overloaded, but cannot be overridden.
iv) In "Method Overloading", we change the method signature, but we don't change "method Signatures in
"Method Overriding"
v) In "Method Overloading" , access modifiers and return types have no role to play, but
in "Method Overriding", there are some rules that should be followed regarding them
vi) In "Method Overloading", we change the parameters and make them work with different
scenarios but in "Method Overriding", we make the methods more specific for the child class.
vii) "Static methods" can be overloaded, but they can not be overridden.




 */

public class C01Animal {
    public void eat(){
        System.out.println("Animals eat...");
    }
}
