package practices_dt.miniproject.busticketcalculation;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    //Bus number, seats

    public String busNum;

    public List<String> seats= new ArrayList<>();

    public Bus(String busNum) { //Constructor
        this.busNum = busNum;

        for (int i = 1; i < 33; i++) {

            seats.add(i+ "");

        }


    }
}
