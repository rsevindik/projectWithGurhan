package Day21_Loops;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647; // or you can go with 99999999999 (until it gets excepted.!)

        for (int i = 1; i <= 5; i++) {

            System.out.println("enter number");
            int num = scan.nextInt();

            if (num < min) {
                min = num;
            }

        }
        System.out.println("max number among those is: " + min);
    }
}
