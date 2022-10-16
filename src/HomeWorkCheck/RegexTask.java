package HomeWorkCheck;

public class RegexTask {
    public static void main(String[] args) {

        /**
         * Create a program that will have String str(Example: "My*name*is*John*Wick,*and*I'm*looking*for*my*dog").
         * Swap only the first and the last "*" character with "0". All others "*" swap with space " "
         */

        String str = "My*name*is*John*Wick,*and*I'm*looking*for*my*dog";
        String beginning = str.substring(0, str.indexOf("*") + 1).replace("*", "0");
        String middle = str.substring(str.indexOf("*") + 1, str.lastIndexOf("*")).replace("*", " ");
        String end = str.substring(str.lastIndexOf("*")).replace("*", "0");
        String result = beginning + middle + end;
        System.out.println(result);

    }
}
