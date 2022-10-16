package repetition;

public class SubString {
    public static void main(String[] args) {

        String str = "Helo there";
        String str2 = "Hello Worlds";
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());
        System.out.println(str2.isBlank());

        System.out.println(str2.substring(4, 10));
        System.out.println(str2.replace("l", "A"));
        System.out.println(str2.replaceFirst("l", "A"));
        System.out.println(str2.replaceAll("l", "A"));
        System.out.println(str2);
    }
}
