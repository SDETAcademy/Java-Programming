package repetition;

import java.util.Random;

public class NestedIfStatement {
    public static void main(String[] args) {
//        String str = "Tesla";
//        String model = "M3";
//        if (str.equals("Toyota")){
//            if (model.equals("Camry")){
//                System.out.println("The engine size is 2.5");
//            }else if(model.equals("Camry V6")){
//                System.out.println("The engine size is 3.5");
//            }else if (model.equals("Corolla")){
//                System.out.println("The engine size is 1.8");
//            }else {
//                System.out.println("Sorry, we don't have this model in stock");
//            }
//        }else if (str.equals("BMW")){
//            if (model.equals("M5")){
//                System.out.println("The engine size is 5.0");
//            }else if(model.equals("M4")){
//                System.out.println("The engine size is 4.0");
//            }else{
//                System.out.println("Sorry, we don't have this model in stock");
//            }
//        }else {
//            System.out.println("Sorry we don't have this car in stock");
//        }

        Random random = new Random();
        int score = random.nextInt(99);
        System.out.println(score);
        int attempt = 2;
        int pin = 12344;
        boolean isSuccessful = false;

        System.out.println("Please enter your pin");
        if(attempt==3){
            System.out.println("You have locked your card. Call your bank");
        }else if(pin!=1234){
            attempt++;
            System.out.println("You have " + (3 - attempt) + " left");
            if(attempt==3){
                System.out.println("You have locked your card. Call your bank");
            }
        }

    }
}
