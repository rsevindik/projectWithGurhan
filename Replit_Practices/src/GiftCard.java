import java.util.Scanner;
/*
         Charger = 15.00;
         usbCable = 10.00;
         HeadPhonesPrice = 30.00;
         PricePants = 50.00;
         PriceHat = 25.00;
         PriceSocks = 5.00;
         PriceBlanket = 60.00;
         PricePillow = 40.00;
 */
public class GiftCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to buy today?");
        String item = input.nextLine();

        if(item.equalsIgnoreCase("Smartphone")|| item.equalsIgnoreCase("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        else if(item.equalsIgnoreCase("Charger")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(100 - 15)+"$");
        }
        else if(item.equalsIgnoreCase("USB cable")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(100 - 10)+"$");
        }
        else if(item.equalsIgnoreCase("Headphones")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(100 - 30)+"$");
        }
        else if(item.equalsIgnoreCase("Pants")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(100 - 50)+"$");
        }
        else if(item.equalsIgnoreCase("Hat")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(100 - 25)+"$");
        }
        else if(item.equalsIgnoreCase("Socks")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(100 - 5)+"$");
        }
        else if(item.equalsIgnoreCase("Blanket")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(100 - 60)+"$");
        }
        else if(item.equalsIgnoreCase("Pillow")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(100 - 40)+"$");
        }else{
            System.out.println("Invalid Item!");
        }

    }
}
