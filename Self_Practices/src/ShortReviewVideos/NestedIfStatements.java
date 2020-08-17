package ShortReviewVideos;

public class NestedIfStatements {

    public static void main(String[] args) {
/*
        int hourOfDay = 18;

        if(hourOfDay < 12){
            System.out.println("Good Morning!");
        }else{
            if(hourOfDay < 17){
                System.out.println("Good Afternoon!");
            }else{
                System.out.println("Good Evening!");
            }
        }
 */

        int typeSelection = 1;
        int drinkSelection = 1;
        double price = 0;
        String drink = "none";

        if(typeSelection == 1){            // condition 1
            System.out.println("Hot Drinks: select 1 for Tea, 2 for Coffee.");
            if(drinkSelection == 1) {
                price = 2.0;
                drink = "tea";
            }else if(drinkSelection ==2) {
                price = 4.0;
                drink = "coffee";
            }else{
                System.out.println("Invalid hot drink selection!");

            }
        }else if(typeSelection == 2){     // condition 2
            System.out.println("Cold Drinks: select 1 for Iced Tea, 2 for Lemonade.");
            if(drinkSelection == 1) {
                price = 3.2;
                drink = "iced tea";
            }else if(drinkSelection ==2) {
                price = 3.5;
                drink = "lemonade";
            }else{
                System.out.println("Invalid cold drink selection!");

            }
        }else{                        // condition 3
            System.out.println("Invalid drink type selection!");
        }

        if(drink.equals("none"))    // no curly braces are necessary since there is only one statement for if and else
            System.out.println("Please try again");
        else
            System.out.println("Your total for " +drink+ " is $" +price);



    }
}
