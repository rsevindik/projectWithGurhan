import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {

        double salary;
        double yearsOnJob;
        String input;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is you annual salary?");
        salary = keyboard.nextDouble();

        System.out.println("Enter the number of year(s) at your current company");
        yearsOnJob = keyboard.nextDouble();

        if (salary >= 30000) {
            if (yearsOnJob >= 2) {
                System.out.println("Congrats, you are qualify for the loan.!");
            }else{
                System.out.println("You must have been working on your current job for at least two years to qualify");
            }
        }else{
                System.out.println("Your annual salary need to be at least $30,000 a year to qualify");
        }
                System.out.println("Thanks for your business.!");

    }
}
