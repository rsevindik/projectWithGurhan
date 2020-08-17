package com.Coding.freeShots;

import java.util.Scanner;

public class Scanner_Inputs {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter your name and age: ");
            System.out.println("You entered name as: "+input.nextLine()+" and your age is: " +input.nextInt());

            System.out.println("=========================");

            System.out.println("Please enter your character: ");
            char ch = input.next().charAt(0); /** char entery from the user */

            System.out.println("Please enter your 2 numbers: ");
            int x = input.nextInt();        // integer
            int y = input.nextInt();
            System.out.println();   /** to clear "Enter key" left from the previous line(Scanner)   */

            System.out.println("Please enter your statement(text-sentence): ");
            String str = input.nextLine();       // statement (more than a word.!

            System.out.println("Please enter true or false: ");
            boolean b = input.nextBoolean();    // boolean (Conditional statement= true or false)

            System.out.println("Please enter your decimal number: ");
            double d = input.nextDouble();     // decimal entry

            System.out.println(ch);
            System.out.println(x+ " + " +y+ " = "+(x+y));
            System.out.println(str);
            System.out.println(b);
            System.out.println(d);

    }
}
