package repetition;

public class NestedLoopRepetition {
    public static void main(String[] args) {

        String str = "Java";

        for (int i = 0; i<str.length(); i++){
            System.out.print("Letter: " + str.charAt(i) + ": ");
            int count = 0;
            for (int j = 0; j<str.length(); j++){

                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            System.out.println(count);
        }

        String word = "java";
        for(int i = 0; i<word.length(); i++){
            for(int j = 0; j<=i; j++){
                System.out.println(word.charAt(j));
            }
            System.out.println();
        }


        for(int min = 0; min<=4; min++){
            for (int sec = 0; sec<=59; sec++ ){
                System.out.println(min + ": " + sec);

            }
        }


        for (int i=1; i < 10; i++){
            System.out.println();
            for (int j=1; j < 10; j++){
                System.out.println(i+" * " + j + " = " + i*j);
            }
        }

        for (int i= 1; i<=10; i++ ){

            for ( int j = 1; j <= i; j++){
                System.out.print("⭐ ");
            }
            System.out.println();
        }

    }
}
