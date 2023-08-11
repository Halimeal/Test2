package Practice.D0728;

public class C01Cram {
    public static void main(String[] args) {
        int a=0;
        for (int i = 2; i < 112; i++) {
            if (112%i ==0) {
            a=a+1;

            }

        }
        System.out.println(a);

        String S= "Hello World";
        int count=0;

        for (int i = 0; i < S.length() ; i++) {
            if("aeiou".indexOf(S.charAt(i))!= -1){
                count=count+1;
            }

        }
        System.out.println(count);
    }
}
