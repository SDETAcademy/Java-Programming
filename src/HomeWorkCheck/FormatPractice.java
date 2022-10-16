package HomeWorkCheck;

public class FormatPractice {
    public static void main(String[] args) {
        String name = "Nicolas Cage";
        int a = 10;
        float c = 11.111F;
        String str = "My name is %f";
        String edited = String.format(str, c);
        System.out.println(edited);






    }
}
