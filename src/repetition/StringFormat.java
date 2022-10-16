package repetition;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Nick";
        System.out.printf("my name is: %s", name);
        String anotherName = String.format("another name is: %s", "Max");
        System.out.println(anotherName);
    }
}
