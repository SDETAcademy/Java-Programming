package repetition;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz0123456789_!@#$%^&*\";";
        Random random = new Random();
        String password = "";
        int i = random.nextInt(21); //0-20, last one not inclusive
        for (int j = 1; j <= i; j++) {
            int index = random.nextInt(71); //random number between 0 and 70 inclusive, or 71 exclusive.
//            System.out.println(j + ") " + random.nextInt(source.length()));
            System.out.print(source.charAt(index));
            password += source.charAt(index);
        }
        System.out.println("\nPasswrod = " + password);
//main(null);
    }
}
