package repetition;

import java.util.Random;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Random random  = new Random();

        int attempt = 0;
        while(attempt<=10){
            int num = random.nextInt(100);
            if(num%2==1){
            System.out.println("Printing attempt:" + attempt);
            }
            attempt++;
        }


    }
}
