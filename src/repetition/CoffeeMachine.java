package repetition;

public class CoffeeMachine {
    public static void main(String[] args) {


        String drink = "Coffee";
        String extra = "none®";
        double priceForDrink = 5.00;
        double priceForExtra = 2.00;
        if (drink.equals("Coffee")){
            if (extra.equals("none")){
                System.out.println("Your total is $" + priceForDrink);
            }else if(extra.equals("cream") || extra.equals("skim milk")){
                System.out.println("Your price is $" + (priceForDrink+priceForExtra));
            }else {
                System.out.println("Invalid Selection");
            }
        }else {
            System.out.println("Invalid Selection");
        }
    }
}
