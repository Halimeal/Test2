package Practice.old;

public class ForLoops {
    public static void main(String[] args) {

        for(int i=1; i<=6;i++){
            System.out.print(i + " ");

            i++;

        }
        System.out.println();
        for(int j=0; j<=10;j=j+3){
            System.out.print(j + " ");
        }


        for(int j=10;j<15;j++){
            System.out.print(" Hello");
        }
        System.out.println();
        for (char i = 'f'; i>'a'; i--){
            System.out.print(i+ " ");
            i--;
        }
        System.out.println();
        int y=1;
        for(int i=0; i<4;i++) { y+=i;}

            System.out.println(y);

        for (int i= 65; i<68; i++){
            System.out.print((char)i);}

         for(int i= 65; i< 68; i++){
             System.out.println(i);


         }
        System.out.println();

         String s = "Marra";
                 for(int i= s.length()-1;i>-1; i--){
                     char c= s.charAt(i);
                             if(s.indexOf(c)==s.lastIndexOf(c)){
                         System.out.print(c);}


                 }

             String x= "Love";
                 for(int i = x.length()-1; i>=0;i--){
                     System.out.println(x.charAt(i));
                 }

                 

        }
}
