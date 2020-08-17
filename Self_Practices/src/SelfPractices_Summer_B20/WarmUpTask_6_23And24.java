package SelfPractices_Summer_B20;

import java.util.Scanner;

public class WarmUpTask_6_23And24 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your car's Brand: ");
        String brand = keyboard.next();
        System.out.println("What is your car's Model: ");
        String model = keyboard.next();
        System.out.println("What is your car's Year: ");
        int year = keyboard.nextInt();
        System.out.println("What is your car's Color: ");
        String color = keyboard.next();
        System.out.println("What is your car's Mileage: ");
        double mileage = keyboard.nextDouble();
        System.out.println("What is your car's Price: ");
        int price = keyboard.nextInt();

        System.out.println(year +" " +brand + " " +model+ " " +color +", at "+ mileage+
                                        " miles, value is: " +price+ "dollars");

        System.out.println("=============task-2=================");

        System.out.println("What is your company's Name: ");
        String companyName = keyboard.nextLine();

        System.out.println("What is your First Name: ");
        String firstName = keyboard.next();

        System.out.println("What is your Last Name: ");
        String lastName = keyboard.next();

        String fullName = firstName +" "+lastName;

        keyboard.nextLine();      // to be on the safe side (clearing the next line remaining from "enter key"
        System.out.println("What is your Job Title: ");
        String jobTitle= keyboard.nextLine ();

        System.out.println("What is your Annual Salary: ");
        double annualSalary = keyboard.nextDouble();

        System.out.println(fullName + ", \n\tis a " +jobTitle+ ", \n\tworks at " +companyName +", \n\tand earns "
                             + annualSalary+" dollars per year!");

        System.out.println("=============task-3=================");

        System.out.println("build/house number: ");
        int houseNumber = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("street name: ");
        String streetName = keyboard.nextLine();

        //keyboard.nextLine(); is not necessary due to use of nextLine in the front line which already took care of it.!

        System.out.println("Road Name: ");
        String roadName = keyboard.nextLine();

        System.out.println("City Name: ");
        String cityName= keyboard.next();

        System.out.println("State: ");
        String state = keyboard.next();

        System.out.println("Zip Code: ");
        int zipCode = keyboard.nextInt();

        System.out.println("You address is; " +houseNumber +" " +streetName + " " +roadName+ " " +cityName +", "
                + state+" " +zipCode);

        keyboard.close();  // complete the task. disable the compiling/execution.!

    }
}
