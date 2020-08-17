package Day12_Switch_Scanner;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");  // message for users (direction)
        double num = input.nextDouble();
     // or int num1 = input.nextInt();
     // or long num2 = input.nextLong();
        System.out.println("You entered: " +num);
    }
}
