import java.util.Scanner;

public class LogicalAndJava {
    public static void main(String[] args) {

        double salary, yearsOnJob;

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Annual Salary:");
        salary = keyboard.nextDouble();

        System.out.println("Years on job:");
        yearsOnJob = keyboard.nextDouble();

        /*
        if (salary > 30000 && yearsOnJob >2) // && (logical AND) means both criteria need to be met
            System.out.println("Congrats! You are qualify.!");
        else
            System.out.println("You are not qualify!");
         */
        if (salary >= 30000 || yearsOnJob >= 2) // || (logical OR) meaning that only one of the criteria must be met
            System.out.println("Congrats! You are qualify.!");
        else
            System.out.println("You are not qualify!");






    }
}
