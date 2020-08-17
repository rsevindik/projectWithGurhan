package ShortReviewVideos;

import java.util.Scanner;

public class While_Loop2 {

    public static void main(String[] args) {
/*
sum positive integers read until one is not positive.!
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer number at a time: ");
        int nextNumber = input.nextInt();

        int total = 0; // temporary variable assignment is subject to changed.!

        while (nextNumber > 0) {    //prog will be running until while cond get false eventually, then moves to the last print message.!
            total = total+ nextNumber;
            nextNumber = input.nextInt();
        }
        System.out.println("You entered a number less then 1. Sum of all the positive numbers you entered so far is: "+total);
    }
}
