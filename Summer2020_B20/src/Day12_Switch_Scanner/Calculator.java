package Day12_Switch_Scanner;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your annual salary: ");
        double salary = input.nextDouble(); // assign an temporary variable to reuse it again and again!!
        System.out.println("Please enter how many hourly you work per week: ");
        int weeklyHour = input.nextInt();
        int totalHours = weeklyHour * 52;
        double hourlyRate = salary / totalHours;

        System.out.println("Your hourly rate is: $" + hourlyRate);

    }
}
