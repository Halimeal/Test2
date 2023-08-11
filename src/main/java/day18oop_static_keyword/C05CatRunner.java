package day18oop_static_keyword;

public class C05CatRunner {
    public static void main(String[] args) {
        C04Cat myCat= new C04Cat();
        myCat.eat();

        System.out.println(C01Animal.NAME);
        System.out.println(C02Mammal.NAME);
        System.out.println(C03Carnivorous.NAME);
    }
}
