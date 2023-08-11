package day15oop;

public class C03Dog extends C02Mammal{

    public double price;
    public C03Dog() {
        this(12.99);
        System.out.println("No Parameter");}

        public C03Dog(double price){
        super("Puppy", 2);

            System.out.println("Price Parameter");
    }
}
