package day16oop;

public class C06StudentRunner {
    public static void main(String[] args) {
        C06Student std = new C06Student();
        //System.out.println(std.getStdId()); // TH001
        System.out.println(std.getIllness());  // Headache
        System.out.println(std.getGpa());
        System.out.println(std.isDisability());
        std.setStId("SB001");
        System.out.println(std.getStdId());
        std.setIllness("Anxiety");
        System.out.println(std.getIllness()); // Anxiety
    }
}







