package HomeWorkCheck;




public class HomeWork {
    public static void main(String[] args) throws InterruptedException {


        int index = -1;
        System.out.println("Enter your sentence here:");
        String word = "This is a very long sentence";
        System.out.println("Enter a character to find in your sentence:");
        char letter = 'i';
        for (int n= 0; n<word.length()-1; n++) {
            if (word.charAt(n) == letter) {
                index = n;
                System.out.println(word.charAt(n) + " is found at index #" + n);
                break;
            }
        }
        if (index == -1) { // variable index we can use outside the loop now. that's why we reassigned index=n
            System.out.println("Your caracter is not found in the sentence.");
        }
    }
}
