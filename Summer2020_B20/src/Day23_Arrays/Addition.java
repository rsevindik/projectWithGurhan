package Day23_Arrays;

import java.util.Scanner;
/*
warmUp 1- 7-10-2020: write a program that iwll ask user to enter two numbers and calculates the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is neither yes or no, the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop
 */
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("enter the first number");
            int num1 = input.nextInt();
            System.out.println("enter the second number");
            int num2 = input.nextInt();
            int result = num1 + num2;
            System.out.println(result);
            System.out.println("Do you want to continue?");
            String a = input.next();   //.toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))){
                System.out.println("Invalid answer. please enter yes or no");
                System.out.println("Do you want to continue? ");
                a = input.next().toLowerCase();

            }
                if(a.equals("no")){        // or you can add IgnoreCase.!
                break;
            }

        }
        System.out.println("Tank you for using CT calculator");
        System.exit(0);

    }
}
