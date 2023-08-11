package Practice.old;

public class D071402 {
    public static void main(String[] args) {

        String first= "Allahim ne yapacagim ben!";
        String second= "";
        for(int i=0; i<first.length(); i++){
            second= first.charAt(i) + second;

        }

        System.out.println( "Reversed String:" +second);

    }
}
