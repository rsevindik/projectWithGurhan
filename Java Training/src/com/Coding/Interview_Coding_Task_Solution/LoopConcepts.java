package com.Coding.Interview_Coding_Task_Solution;

public class LoopConcepts {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Happy Birthday to You.!");
        }
        int sum = 0;
        for (int t = 1; t <= 5; t++) {
            sum = sum + t;
        }
        System.out.println(sum);

        for (int evenNumber = 2; evenNumber <= 10; evenNumber = evenNumber + 2) {
            System.out.println(evenNumber);
        }
        for (int oddNumber = 1; oddNumber < 10; oddNumber = oddNumber + 2) {
            System.out.println(oddNumber);
        }
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("Keep Going!");
            }
        }

        for (int m = 1; m <= 20; m++) {
            System.out.println(m);
            if (m % 5 == 0) {
                System.out.println("What's Up!");
            }
        }
    }
}
