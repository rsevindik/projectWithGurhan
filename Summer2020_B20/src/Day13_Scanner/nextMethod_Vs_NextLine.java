package Day13_Scanner;

import java.util.Scanner;

public class nextMethod_Vs_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        input.nextLine();  // will clear all the remaining line including "Enter key"
                            // then you will be able to move to the next variable.!

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("Full name: "+fullName);
    }
}
