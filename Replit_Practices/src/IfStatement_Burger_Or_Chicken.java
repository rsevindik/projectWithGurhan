import java.util.Scanner;
/*
Instructions from your teacher:
a fast food company has two main order types, burger meal and chicken meal.
both have the same prices.
so if a cashier enters "burger" or "chicken " he will get the same price
a float : 10.0
this test can be done with one if.
check if in (string variable) equals "burger" or "chicken"  and output the price 10.0
also if input is "soda" output 2.0 (do this with another if)
for example:
in = "burger" == output: 10.0
in = "chicken " == output: 10.0
in = "soda" === output: 2.0
hint or operator in java is  ||
 */
public class IfStatement_Burger_Or_Chicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Would you like Burger or Chicken meal? ");
        String mealType = s.next().toLowerCase();
        System.out.println("Would you like soda with your meal? Please enter yes or no");
        String anyDrink = s.next().toLowerCase();

        float totalPrice = 0.0f;

        if(mealType.contains("burger") || mealType.contains("chicken")){
            totalPrice +=10.0f;
        }

        if(anyDrink.contains("yes") ){
            totalPrice += 2.0f;
        }
        System.out.println("Your total is: "+totalPrice);
    }
}
