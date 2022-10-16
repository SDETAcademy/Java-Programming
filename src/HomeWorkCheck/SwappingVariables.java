package HomeWorkCheck;

public class SwappingVariables {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int temp;
        System.out.println(a);
        System.out.println(b);

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }
}
