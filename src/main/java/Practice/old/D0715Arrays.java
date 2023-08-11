package Practice.old;

import java.util.Arrays;

public class D0715Arrays {
    public static void main(String[] args) {
        String s= "Halime sen bu isi basaracaksin";
        String[]t= s.split("s");
        System.out.println(Arrays.toString(t));

        int[] a= {3,7,8,6,4};
        int[]b={3,7,8,6,4};

       boolean u=Arrays.equals(a,b);
        System.out.println(u);



    }
}
