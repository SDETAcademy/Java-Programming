package day_15;

public class IfCharacterIsLowerCase {
    public static void main(String[] args) {


        String str = "Hello World";
        String str2 = "Hello World";
        String str3 = new String("Hello World");
        String str4 = new String("Hello World");

        System.out.println(str2==str);
        System.out.println(str3==str4);
        System.out.println(str.equals(str4));
    }
}
