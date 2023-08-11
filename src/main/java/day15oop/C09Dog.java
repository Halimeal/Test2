package day15oop;

public class C09Dog extends  C08Mammal{
    @Override // @Override Annotation checks "Override" rules in our code
    public void eat() {
        System.out.println("Dogs eat...");
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }
}
