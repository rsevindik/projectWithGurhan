import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        //ENTER CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice = input.nextInt();
        String change = " ";
        int quarters = (100 - itemPrice)/25;
        int dimes = (100 - itemPrice)%25/10;
        int nickels = (100 - itemPrice)%25%10/5;

        if(itemPrice>=25 && itemPrice<=100){
            if(itemPrice%5 == 0){
                change = "Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.";
            }else if(itemPrice%5 != 0){
                change = "Invalid price!";
            }
        }else{
            change = "Invalid price!";
        }
        System.out.println(change);

        input.close();
    }
}
