package SG_Practice;

public class SG_day2 {
    public static void main(String[] args) {


    int a=0;
    for(int i=2; i<112;i++){
        if(112%i==0){
            a=a+1;
        }

    }

        System.out.println(a);
String S= "Java issss good";
int count=0;
        for (int i = 0; i < S.length(); i++) {
            if("sg".indexOf(S.charAt(i)) != -1){

                count=count+1;

            }



            
        }System.out.println(count);


    }}
