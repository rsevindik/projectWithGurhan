import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int hours;
        double grossPay;        // or it can be written as (double grossPay, payPate = 25.0;) together!!
        double payRate;

        // creating Scanner (standard) library for getting inputs (declaring scanner!)
        // new Scanner stands for customer's info received by System.in
                                                  // (computer) and keyboard also means device used for collecting info
        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("Name you entered is: " +name);

        System.out.println("How many hours did you work this week?");
        hours = keyboard.nextInt();

        System.out.println("Hours you worked this week: "+hours);

        System.out.println("What is your hourly pay rate?");
        payRate = keyboard.nextDouble();

        System.out.println("Hourly pay rate: $"+payRate);

        grossPay = hours * payRate;     // calculating gross Pay.!

        System.out.println("Hello, "+ name);
        System.out.println("Your gross pay is $" +grossPay);

    }
}
