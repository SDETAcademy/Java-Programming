package repetition;

public class isDuplicate {
    public static void main(String[] args) {


        String str = "java";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }

            if(count>1){
                System.out.println(str.charAt(i) + " has duplicates");
            }else{
                System.out.println(str.charAt(i) + " has no duplicates");
            }
            count=0;

        }

    }
}
