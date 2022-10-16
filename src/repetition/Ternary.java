package repetition;

public class Ternary {
    public static void main(String[] args) {

        int a = 10;
        int b = 23;
        boolean isRaining = false;

        String result = (isRaining) ? "Pass" : "Fail";
        System.out.println(result);

        String name = "Alex";
        switch (name) {
            case "Alex":
                System.out.println("Name is Alex");
                break;
            case "Vika":
                System.out.println("Name is Vika");
            case "Nick":
                System.out.println("Name is Nick");
            default:
                System.out.println("Wrong name");

        }

        char nameChar = 'V';
        switch (nameChar) {
            case 'A':
                System.out.println("Name is Alex");
                break;
            case 'V':
                System.out.println("Name is Vika");
            case 'N':
                System.out.println("Name is Nick");
            default:
                System.out.println("Wrong name");

        }

    }
}
