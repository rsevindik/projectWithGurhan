package Day12_Switch_Scanner;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int a = input.nextInt(); // assign an temporary variable.!!
        System.out.println("Please enter your second number: ");
        int b = input.nextInt();
        int sum = a+b;

        System.out.println("Sum of those two numbers are: " + sum);


    }
}
