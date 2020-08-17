package Day13_Scanner;

import java.util.Scanner;

public class Scanner_NexLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
        System.out.println("Enter your first name: ");
        String fistName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

      //  String fullName = fistName + " "+lastName;   you can use .nextLine to get everything including "enter"

 */

        System.out.println("Enter your full name :");
        String fullName = input.nextLine();

        System.out.println("Enter your full name :");
        String companyName = input.nextLine();


    }
}
