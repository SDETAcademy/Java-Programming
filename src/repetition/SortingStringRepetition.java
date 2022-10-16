package repetition;

public class SortingStringRepetition {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 10; inner >= outer; inner--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int x = 10;
        int y = 5;

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(y);
        System.out.println(x);
    }
}
