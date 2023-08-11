package day15oop;

public class C01Animal {


    /*

1)Java uses "Constructors" from parent to child because
  without having parent we cannot have child.
2)Every constructor has "super();" in the first line of the constructor body.
  "super();" is invisible as default, if you want you can make it visible to increase readability.
3)"super();" is for calling constructors from parent class.
  If the parent class has multiple constructors, by adding parameters into the "super();"
  parenthesis.
4)"this();" is for calling constructors from the same class.
  "this();" must be used inside the constructor body in the first line.
5)Using "super();" and "this();" in object creation gives us flexibility.
    */

        public String name;
        public int age;
        public boolean isPet;

        public C01Animal() {

            System.out.println("No parameter");
        }
        public C01Animal(String name) {
            this();

            this.name = name;
            System.out.println("Name parameter");
        }
        public C01Animal(String name, int age) {
            this("cute");

            this.name = name;
            this.age = age;
            System.out.println("Name and Age parameters");
        }
        public void eat(){
            System.out.println("Mammals eat...");

        }
    }

