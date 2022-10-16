package repetition;

public class DoWhile {
    public static void main(String[] args) {
        int apples = 10;
        do {
            System.out.println("Eating an apple: " + apples + " left");
            apples--;
        }
        while (apples >= 0);

    }
}
