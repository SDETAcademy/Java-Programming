package HomeWorkCheck;


public class Cornelia {
    public static void main(String[] args) {
        String str = "This is a very long sentence";
        char character = 'e';
        for(int i = 0; i < str.length(); i++){
            if(character != str.charAt(i)){
                continue;
            }else if(character == str.charAt(i)){
                System.out.println("Character " + character + " is at the index of: #"+ i);
                break;
            }

        }
    }
}
