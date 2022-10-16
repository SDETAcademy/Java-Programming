package repetition;

public class StringManipulations {
    public static void main(String[] args) {

        String str = "my name is Vova";

        if(str.equalsIgnoreCase("vova")){
            System.out.println("The name is there");
        }else{
            System.out.println("The name is not found");
        }

        System.out.println(str.length());
        String str2 = "" + str.charAt(3);
        System.out.println(str2);
        String str3 = str.replace('o', 'a');
        System.out.println(str3);
        String str4 = str.substring(3,10);
        System.out.println(str4);
        String str5 = str.toUpperCase();
        System.out.println(str5);
        int lastIndex = str.lastIndexOf('a');
        System.out.println(lastIndex);
        int firstIndex = str.indexOf("a");
        System.out.println(firstIndex);

        String some = "    Nickcc    ";
        System.out.println(some.trim());



    }
}
