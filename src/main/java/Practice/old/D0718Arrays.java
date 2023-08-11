package Practice.old;

import java.util.Arrays;

public class D0718Arrays {
    public static void main(String[] args) {

        int arr1[] ={1,2,3};
        int arr2[] ={1,2,3};
        int arr3[]= {3,2,1};

        System.out.println(arr1==arr1);//referance noktalari da ayni
        //2:
        int arr[]= {1,23,12,2,3};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,1));

        //3.
        int arr4[]={12,23,13,2,3};

        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,12));
        //4.

        int arr5[]={12,23,12,2,3};
        Arrays.sort(arr5);
        System.out.println(Arrays.binarySearch(arr5,5));
        //5.
        String s="I like to move it";

        String arr6[]= s.split("it");
        System.out.println(Arrays.toString(arr6));

        //5.
        String phoneNumber = "+1-407-640-1256";
        System.out.println( phoneNumber.substring(3,6));//Yani bir string de belli bir bolgeyi arayacaksak,
        // baslangic ve son noktasini koyarak arayabiliriz.
        //6.
        String input= "Hello Welcome to TechPro Education";

        String[] result1= input.split(" ");
        String [] result2= input.split("X");

        System.out.println(result1.length + "-"+ result2.length);

        //7:

        int arr7[]= {21,22,23,24,25,26};
        for( int i=0; i<=arr.length; i++){
        System.out.print(arr7[i]+ " ");}

        //8:
        String p = "Java, I like Java?";
        String arr8[] = p.split("");
        int counter= 0;
        for(int i=0; i<arr8.length; i++){
            if(arr8[i].equals("a")){
                counter++;
            }

        }
        System.out.println("The number of the character:"+ counter);//The number of the character:4
        //9:
        String t = "Java, I like Java?";
        String arr9[] =t.split("a");
        System.out.println("The number of the character:"+ (arr9.length-1));
        //Multi Dimensional Arrays
        //1.






        


}}




