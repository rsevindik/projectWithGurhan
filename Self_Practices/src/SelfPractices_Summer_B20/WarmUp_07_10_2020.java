package SelfPractices_Summer_B20;

import java.util.Scanner;

public class WarmUp_07_10_2020 {
    public static void main(String[] args) {

      // do {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your first number: ");
           int num1 = input.nextInt();
           System.out.println("Enter your first number: ");
           int num2 = input.nextInt();

           System.out.println("Would you like to continue: Y or N");
           boolean wantsCont = input.nextBoolean();

           int sum = num1 + num2;

           if (wantsCont) {
               System.out.println("Enter your first number: ");
               int num3 = input.nextInt();
               System.out.println("Enter your first number: ");
               int num4 = input.nextInt();

           } else if (!wantsCont) {
               System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
          //     break;
           } else {
               System.out.println("Would you like to continue: Y or N");
               wantsCont = input.nextBoolean();
           }


     //  }while();

    }


}
