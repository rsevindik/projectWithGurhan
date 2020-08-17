package SelfPractices_Summer_B20;

import java.util.Scanner;

public class WarmUp_6_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       /*
        System.out.println("what is length of your radian(r)?");
        double r = input.nextDouble();

        double pi = 3.14, areaOfCircle;
        areaOfCircle = pi * (r*r);

        System.out.println("The area of your circle is: "+areaOfCircle);

        System.out.println("============Task-2=================");

        System.out.println("what are the length and width of your rectangular shape?");
        double length = input.nextDouble();
        double width = input.nextDouble();

        double areOfRect = length * width;

        System.out.println("The area of your rectangular shape is: "+areOfRect);

        System.out.println("============Task-3=================");

        System.out.println("Enter the weight in kg: ");
        double kg = input.nextDouble();
        double lb = kg/2.2;

        System.out.println(kg+ " kg is equal to: " +lb + " pounds");

        System.out.println("============Task-4=================");

        System.out.println("Enter the volume in gallons: ");
        double gal = input.nextDouble();
        double lt = gal*3.8;

        System.out.println(gal+ " gallons is equal to: " +lt + " litters");

       System.out.println("============Task-5=================");

        System.out.println("Annual salary?");
        double annualSalary = input.nextDouble();

        System.out.println("state tax rate?");
        double stateTaxRate = input.nextDouble();

        System.out.println("federal tax rate?");
        double federalTaxRate = input.nextDouble();

        double totalTaxDeduction = annualSalary * (federalTaxRate + stateTaxRate);

        double salaryAfterTax = annualSalary - totalTaxDeduction;

        System.out.println("Annual Salary: " +annualSalary);
        System.out.println("Total Tax Deduction: " + totalTaxDeduction);
        System.out.println("Annual Salary after Tax Deduction: " +salaryAfterTax);

        */
        System.out.println("============Task-6=================");

                String answer;
                do {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("\t\tPlease select a task:\n" +
                            "*********************************************\n" +
                            "*  1) Calculate the Area of a Circle        *\n" +
                            "*  2) Calculate the Area of a Rectangle     *\n" +
                            "*  3) Convert KG to LB                      *\n" +
                            "*  4) Convert Gallons to Litters            *\n" +
                            "*********************************************");
                    int num = Integer.parseInt(sc.nextLine());
                    switch (num) {
                        case 1:
                            System.out.println("Please enter the radio of the circle");
                            double radio = sc.nextDouble();
                            double areaCir = Math.PI * radio * radio;
                            System.out.println("The area of a circle with " + radio + " radio is " + areaCir);
                            break;

                        case 2:
                            System.out.println("Please, enter the width of the rectangle");
                            double width = sc.nextDouble();
                            System.out.println("Please, enter the height of the rectangle");
                            double height = sc.nextDouble();
                            double areaRec = width * height;
                            System.out.println("The are of the rectangle with " + height + " height & " + width + " width is " + areaRec);
                            break;

                        case 3:
                            System.out.println("Please enter the weight in KG");
                            double kg = sc.nextDouble();
                            double lb = kg * 2.2;
                            System.out.println(kg + " Kilograms are equal to " + lb + " Pounds");
                            break;

                        case 4:
                            System.out.println("Please enter the amount of Gallons");
                            double gallons = sc.nextDouble();
                            double litters = gallons * 3.78541;
                            System.out.println(gallons + " Gallons are equal to " + litters + "  litters");
                            break;
                        default:
                            System.out.println("Invalid entry, please try again.");

                    }
                    System.out.println("\nWould you like to perform another task?\n" +
                            "Enter Y to continue or any other key to exit.");
                    answer = sc.next();

                }while (answer.equalsIgnoreCase("y"));

            }
        }