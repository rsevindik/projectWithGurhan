package SelfPractices_Summer_B20;

import java.util.Scanner;

public class WarmUp_6_24 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner (System.in);
       /*
        System.out.println("Please enter you number between #0 and #9: ");
        int num = keyboard.nextInt();
        String sayIt = " ";

        if(num>0 && num <= 9){
            if(num == 0){
               sayIt = "Zero";
            }
            else if(num == 1){
                sayIt = "One";
            }
            else if(num == 1){
                sayIt = "One";
            }
            else if(num == 1){
                sayIt = "One";
            }
            else if(num == 1){
                sayIt = "One";
            }
            else if(num == 1){
                sayIt = "One";
            }
            else if(num == 1){
                sayIt = "One";
            }
            else if(num == 1){
                sayIt = "One";
            }else{
                sayIt = "Nine";
            }
        }else{
            sayIt = "Invalid Entry.!";
        }
        System.out.println("The number you entered is: \""+num+"\"");

        keyboard.close();

        System.out.println("=========Task-2===============");

        System.out.println("Please enter your age: ");
        int age = keyboard.nextInt();

        if(age > 21 && age < 99){
            System.out.println("here is your wine.!");
        }else if(age<21 && age > 7){
            System.out.println("get out kid.!");
        }else{
            System.out.println("Invalid Entry!");
        }
        System.out.println();

        keyboard.close();

        System.out.println("=========Task-3===============");

        System.out.println("Please entry the building number: ");
        int bldgNum = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Please entry the Street address: ");
        String streetAddress = keyboard.nextLine();

        System.out.println("Please entry the City name: ");
        String cityName = keyboard.next();

        System.out.println("Please entry the State name: ");
        String stateName = keyboard.next();

        System.out.println("Please entry the ZipCode: ");
        int zipCode = keyboard.nextInt();

        System.out.println("Please entry your First Name: ");
        String firstName = keyboard.next();

        System.out.println("Please entry your Last Name: ");
        String lastName = keyboard.next();

        System.out.println("Ship To:\t" +firstName+" "+lastName+ "\n\t\t\t"+bldgNum+ " "+streetAddress+
                                    "\n\t\t\t"+cityName+", "+stateName+zipCode);

        keyboard.close();

        System.out.println("=========Task-4===============");

        System.out.println("Please enter only number of the month");
        int monthNum = keyboard.nextInt();
        int daysOfMonth = 0;

        if(monthNum == 2){
            daysOfMonth = 28;
        }else if(monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11 ){
            daysOfMonth = 30;
        }else{
            daysOfMonth = 31;
        }

        System.out.println("the month of " +monthNum+ " has total numbers of " +daysOfMonth+ "days.");

        keyboard.close();
        System.out.println("=========Task-5===============");

        */

        System.out.println("Enter your grade: ");
        int score = keyboard.nextInt();
        String grade = " ";

        if(0 <= score && score <= 100) {
            if (score >= 90) {
                grade = "Excellent";
            } else if (80 <= score) {
                grade = "Great";
            } else if (70 <= score) {
                grade = "Good";
            } else if (60 <= score) {
                grade = "Passed";
            } else if (0 <= score && score <= 59) {
                grade = "Failed";
            } else{
                grade = "Invalid Entry";
            }
            System.out.println(grade);

            keyboard.close();
/*
        System.out.println("=========Task-6===============");

        System.out.println("Please enter your annual salary: ");
        double annualSalary = keyboard.nextDouble();

        keyboard.nextLine();
        System.out.println("Please enter your full name: ");
        String fullName = keyboard.nextLine();

        System.out.println("Are you married? True or False: ");
        boolean maritalStatus = keyboard.nextBoolean();
        double taxRate, taxDeduction, salaryAfterDeduction = 0;

        if(maritalStatus == true){
            taxRate = .20;
            taxDeduction = annualSalary * taxRate;
            salaryAfterDeduction = annualSalary - taxDeduction;
        }else{
            taxRate = .25;
            taxDeduction = annualSalary * taxRate;
            salaryAfterDeduction = annualSalary - taxDeduction;
        }
        System.out.println("Dear " +fullName+ ", \n\tBased on your annual salary of "+annualSalary+ " and marital status;" +
                " \n\tyour tax rate is: " +taxRate+" \n\tand the total amount of tax deduction for this year is: "
                +taxDeduction+ ". " + "\n\tYour salary after the tax deduction is: "+salaryAfterDeduction);

        keyboard.close();

 */
        }
    }
}
