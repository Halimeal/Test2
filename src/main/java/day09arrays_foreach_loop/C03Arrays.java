package day09arrays_foreach_loop;

import java.util.Arrays;

public class C03Arrays {
    public static void main(String[] args) {
        //Example 5: Create an integer array and print all the elements less than 5
        //           [] ==> 3,-3

        int[] num= {12,3,-3,5,23};
        int[] num1= new int[num.length];
        int idx=0;


        System.out.println(Arrays.toString(num));

        for(int w: num){

            if(w<5) {
                num1[idx]=w;

                idx++;
            }


    }System.out.println(Arrays.toString(num1));

        int[] numbers= {5,9,0,3,-12};
        Arrays.sort(numbers);

        for(int v: numbers){

            if(v<6){
                System.out.print(v+" ");
            }
        }
        System.out.println();

     //Example 6: Check if a specific element exist in an array or not

        int[] nums= {12,3,14,5,23};
        Arrays.sort(nums);
        int Result= Arrays.binarySearch(nums,14);
        System.out.println(Result);//2==> binarySearch() method gives you the index of the existing element.
                                   //     binarySearch() method cannot be used with repeated elements.
                                  //      ***Before using binarySearch() method, you have to use sort() method.

        int r=Arrays.binarySearch(nums,11);
        System.out.println(r);//-3==> "-" means "does not exist
                              //       "3" means if it exists it would be 3rd element in the sorted array






    }
}
