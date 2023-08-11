package day04logical_operators_if_switch_statements;

public class C02LogicalOperators {

    public static void main(String[] args) {

        //"AND" Logical Operator: &&
        // Note 1:Just a single false is enough to make the result false (Perfectionist)
        //Note 2: To get "true" from "&& Operation", all must be true

        int i =10;

        int k = 5;

        System.out.println( (i>k)&&(i==2*k)&&(i/k==2)&&(i%k==2));//% shows the remainder of division
        // In the following example the first is the false
        //Because just a single false makes the result false

        System.out.println( (i<k)&&(i==2*k)&&(i/k==2)&&(i%k==2));

        //If u use && in "AND" operation Java does not check the other after finding the first false
        //But if you want Java to check all operations use "&"

        System.out.println( (i>k)&(i==2*k)&(i/k==2)&(i%k==2));

        //"Or" Logical Operator :||

        //Note 4: Just a single "true" is enough to make the result " true" in "||" operation
        // Note 5: to get "false" from "||" operation, all must be "false"

        int a= 6;
        int b= 2;

        System.out.println( (a>=b)||(a%b!= 0 )||(a<=3*b));//True

        //Note 6: There is no single usage of "|", in "OR" operation we must use "||"

        System.out.println(((a>=b)||(a%b!=0)) && (a<=3*b));

    }
}
