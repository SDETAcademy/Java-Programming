package repetition;

import java.util.Scanner;

public class JavaVSPython {
    public static void main(String[] args) {


        String word = "What's the difference between java, javascript and python?";
        int countJ = 0;
        int countP = 0;
        boolean result = true;

        for(int i = 0; i < word.length()-5; i++){
            String j = word.substring(i, i+4);
            String p = word.substring(i, i + 6);

            if(j.equals("java") || p.equals("python") ){
                if(j.equals("java")){
                    countJ++;
                }if(p.equals("python")){
                    countP++;
                }
            }
            if(countJ == countP){
                result = true;
            }else{
                result = false;
            }
        }
        System.out.println(result);
    }
}

