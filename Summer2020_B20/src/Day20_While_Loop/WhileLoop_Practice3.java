package Day20_While_Loop;

import java.util.Scanner;

public class WhileLoop_Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "Cybertek123";

        System.out.println("Enter your password");
        String input = scan.nextLine();

        while(!input.equals(password)){  // we code as if statement then converted into while.!!
            System.out.println("please try again!");
            input = scan.nextLine();
        }
        System.out.println("Logged in!");
    }
}