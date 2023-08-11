package day10multidimensional_arrays_arraylists;

import java.sql.SQLOutput;
import java.util.Arrays;

public class C02MultidimensionalArrays {
    public static void main(String[] args) {
        //How to create multidimensional Array

        int[][] a =new int[3][2];

        //How to print multidimensional array

        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]

        //How to add elements

        a[0][1]=3;
        a[0][0] =2;
        a[1][0] =5;
        a[1][1]=2;
        a[2][0] =7;
        a[2][1] =9;
        System.out.println(Arrays.deepToString(a));//[[2, 3], [5, 2], [7, 9]]

        //Example 1: Type code to find the total number of elements in a multidimensional Array

        String[][] b= {{"X","U"}, {"a","d","m"},{"T"}};
        int sum=0;

        for(String[] w: b){ sum= sum+w.length;

        }
        System.out.println(sum);

        //Example 2: Print the elements which has "a" in it from a multidimensional array

        String[][] c= {{"Java", "is"},{"easy"},{"to","learn"}};

        for(String[] w: c){
            for(String u: w){
                if(u.contains("a")){
                    System.out.print(u+" ");
                }

            }

        }
        //Example 3: Type code to find the maximum and minimum elements in a two-dimensional integer array


        int[][] n= {{5,2},{14,9},{7}};
        int max = n[0][0];
        int min= n[0][0];
        for(int[] w:n){
            for(int u: w){
                max= Math.max(u,max);
                min= Math.min(u,min);
            }

        }


        System.out.println(max);
        System.out.println(min);

        //Example 4: Type code to convert a multidimensional array to a one dimensional array
        //           {{5,2},{14,9},{-7}} ==> {5,2,14,9,-7
        int [][] p= {{5,2},{14,9},{-7}};

        int ln =0;

        for(int[]w : p){
            ln=ln +w.length;

        }

        int[] r =new int[ln];// [0,0,0,0,0]

        //array elemanlarini indirmek icin

        int idx=0;
            for(int[]w :p){
                for(int u:w){
                    r[idx]=u;
                    idx++;}}

        System.out.println(Arrays.toString(r));



            }
        }














