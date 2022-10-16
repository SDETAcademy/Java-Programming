package HomeWorkCheck;

public class ReplaceAllPractice {
    public static void main(String[] args) {
        String str = "My name is {firstName} {lastName}";
        String firstName = "Nicolas";
        String lastName = "Cage";
        String edited = str.replaceAll("\\{firstName}", firstName).replaceAll("\\{lastName}", lastName);
        System.out.println(edited);
    }
}
