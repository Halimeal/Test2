package Practice.D0804_Polymorphism;

public class Vehicle_Runner {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        System.out.println("Car initial speed: " + car.getSpeed());
        System.out.println("Bicycle initial speed: " + bicycle.getSpeed());
        car.speedUp();
        bicycle.speedUp();
        System.out.println("\nCar speed after speeding up: " + car.getSpeed());
        System.out.println("Motorcycle speed after speeding up: " + bicycle.getSpeed());




    }
}
