package day15oop;


public class C02Mammal extends C01Animal{

    public String type;
    public int height;

    public C02Mammal(){

        System.out.println("No parameter");
    }
    public C02Mammal(String type, int height){
        super("Cute", 5);

        System.out.println("Type and Height parameters");
    }

}


