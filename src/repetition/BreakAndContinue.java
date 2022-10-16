package repetition;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            if (i == 1 || i == 4){ continue;}   // continue means ignore current iteration and go to next one
            System.out.println(i);
        }



        for (int i=0; i<=10; i++){
            if (i==9){break;}                  // exits the loop when hits break
            System.out.print(i);
        }

        for (int i =0; i <= 10; i++){
            if (i==9){return;}                    // exits main method when hits return;
            System.out.print("*"+i);
        }


    }
}
