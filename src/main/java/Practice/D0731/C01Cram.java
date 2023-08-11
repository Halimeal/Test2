package Practice.D0731;

public class C01Cram {
    public static void main(String[] args) {

        int counter=0;

        for (int i = 2; i<112 ; i++) {

            if(112%i==0){
                counter= counter+1;
            }

        }System.out.println(counter);
    }
}
