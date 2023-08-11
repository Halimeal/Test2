package Practice.type_casting;

public class T01TypeCasting {
    public static void main(String[] args) {


        // Convert the given numbers in to decimal and print the sum of them in the console
    int num1 = 10;
    int num2 = 19;
    int num3 = 23;

        System.out.println((double) num1+(double) num2+(double)num3);


     char a= 'A';
     int b=a;
        System.out.println(b);

        long bigNum = 1000000000L;

        int smallNum= (int) bigNum;

        System.out.println(smallNum);

        byte num=127;
        int Num1= num;

        System.out.println(Num1);

        double d1= 3.12;
        double d2= 26.3;
        double d3= 0.5;

        float f1= (float) d1;
        float f2= (float) d2;
        float f3= (float) d3;

        System.out.println(" This is the multiplication :" + (f1* f2* f3));

    }
}
