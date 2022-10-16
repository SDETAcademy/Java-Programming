package day_18;

public class JavaMemory {
    public static void main(String[] args) {


        String str = "Helloo";
        String strTwo = "Hello";

        System.out.println(str.equals(strTwo));
        System.out.println(str==strTwo);



        /**
         * IMMUTABLE
         * Java has 2 memories: Heap and Stack
         * Also Heap memory has a special place called String pool
         * Anytime we declare String literaly = we create an object in String pool
         */





    }
}
