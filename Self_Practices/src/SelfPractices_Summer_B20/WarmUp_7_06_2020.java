package SelfPractices_Summer_B20;

import java.util.Scanner;

public class WarmUp_7_06_2020 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
/*
        for (int i = 1; i <=100 ; i++) {
            if(i%3 ==0){
                continue;    // skip num if divisible by 3.!
            }
            System.out.println(i);
        }
        System.out.println("=============================");

        int sum1 = 0;
        for(int i =1; i <=5; i++){
        System.out.println("enter your number "+i);
        int num = input.nextInt();
        sum1 += num;
        }
        System.out.println(sum1);  // sum of the 5 different numbers that user enters

        System.out.println("=============================");

        System.out.println("enter your first number:");
        int sum2 = 0;

        for (int i = 0; i >= 0; ) {
            int num = input.nextInt();
            if (num < 0) {
                System.out.println("you entered a negative number");
                break;
            } else {
                sum2 += num;
                System.out.println("The sum is: " + sum2 + ". Please enter another positive number: ");
            }
        }

 */
        System.out.println("=============================");

        System.out.println("enter your number:");
        int num = input.nextInt();
        int sum = 1;
        String deBug = ""+num;

        for (int i = num; i > 1;i--) {
                sum *= i;
                deBug += " * "+ (i-1);
            }
            System.out.println("The sum of "+deBug+" is: " + sum);

        input.close();
    }
}


