package practices_dt.miniproject.busticketcalculation;

public class Ticket {
    // distance, journey type, price, seat number

    public double distance;

    public int journeyType;

    public int seatNo;

    public double price;


    // to print these values on the ticket, we are going to create a print method

    public void printTicket(Bus bus){
        System.out.println("---Ticket details---");
        System.out.println("Bus number: "+ bus.busNum);
        System.out.println("Distance:  "+ this.distance);
        System.out.println("Type of journey: "+ (this.journeyType == 1 ? "One way": "Round Trip"));
        System.out.println("Your seat no: "+ this.seatNo);
        System.out.println("Total Price: "+ this.price);
        System.out.println("Have a nice trip! ");

    }
}
