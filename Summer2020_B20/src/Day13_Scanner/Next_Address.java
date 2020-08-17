package Day13_Scanner;

import java.util.Scanner;

public class Next_Address {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the building number: ");
        int buildingNumber = input.nextInt();

        input.nextLine(); // just to clear the remaining "Enter"

        System.out.println("Enter the street name: ");
        String streetName = input.nextLine();

        System.out.println("Your address is: " +buildingNumber+" "+streetName);

        input.close(); // it's better closing scanner after usage.!




    }
}
