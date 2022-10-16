package HomeWorkCheck;

import java.util.Random;

public class Roman {
    public static void main(String[] args) {
        Random random = new Random();
        int temperature = random.nextInt(101);
        System.out.println(temperature);
        if (temperature < 32) {
            System.out.println("The weather is \"Winter\"");
            boolean isSnowing = random.nextBoolean();
            if (isSnowing == true) {
                System.out.println("Please take your gloves, so you can make a snowman");
            } else {
                System.out.println("No snow outside, you don't need gloves");
            }
        } else if (temperature >= 32 && temperature <= 65) {
            System.out.println("It's warm outside, you don't need a hat");
        } else if (temperature > 65) {
            System.out.println("The weather is \"Summer\"");
            boolean isRaining = random.nextBoolean();
            if (isRaining == true) {
                System.out.println("Enjoy your sunny day");
            }else {
                System.out.println("Don't forget the umbrella");

            }
        }

    }
}
