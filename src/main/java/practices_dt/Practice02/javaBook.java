package practices_dt.Practice02;

public class javaBook {
    public static void main(String[] args) {


        StringBuilder strBld = new StringBuilder("John ");
        strBld.append("Woo ").append("Leo").deleteCharAt(6);
        System.out.println(strBld);
    }
}