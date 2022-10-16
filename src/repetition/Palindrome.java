package repetition;

public class Palindrome {
    public static void main(String[] args) {

        String str = "civic";
        String result = "";
        boolean isPolindrome = true;
        for (int i = 0, j = str.length()-1; i < str.length()/2; i++, j--) {
            if(str.charAt(i)!=str.charAt(j)){
                isPolindrome = false;
                break;
            }
        }
//redivider, deified, civic, radar, level, rotor, kayak, reviver, racecar, madam, and refer.
        System.out.println(result);
        System.out.println(isPolindrome);


        int a = 15, b = 20;
        System.out.println(a);
        System.out.println(b);
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);





        int x=10, y = 5;

                x = x  + y;
                y = x  - y;
                x = x  - y;



        System.out.println(y);
        System.out.println(x);

    }
}
