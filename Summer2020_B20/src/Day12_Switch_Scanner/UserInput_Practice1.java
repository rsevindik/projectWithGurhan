package Day12_Switch_Scanner;

import java.util.Scanner;

public class UserInput_Practice1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");

        double num = input.nextDouble();

        String result = (num%2 == 0)? num + " is even number" : num + " is odd number";
        System.out.println(result);
    }
}
