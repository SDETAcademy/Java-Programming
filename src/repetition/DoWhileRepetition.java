package repetition;



public class DoWhileRepetition {
    public static void main(String[] args) {
        int apples = 10;
        do {
            System.out.println("Eating an apple: " + apples + " left");
            apples--;
        }
        while (apples >= 0);
//
//        int number = 0;
//        do {
//            System.out.println("number = " + number);
//            number+= 25;
//        }
//        while (number <= 1000);
    }
}

