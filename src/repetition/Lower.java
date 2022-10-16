package repetition;

public class Lower {
    public static void main(String[] args) {

        char character = 'z';
        for (char i = 'a'; i <= 'z'; i++) {
            if (i == character) {
                System.out.println("the character is lower case");
                break;
            }
        }

        for (char i = 'A'; i <= 'Z'; i++) {
            if (i == character) {
                System.out.println("the character is UPPER case");
                break;
            }

        }
    }
}
