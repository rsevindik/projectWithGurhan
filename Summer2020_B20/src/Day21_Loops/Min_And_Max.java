package Day21_Loops;

import java.util.Scanner;

public class Min_And_Max {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647; // or you can go with 99999999999 (until it gets excepted.!)
        int max = -2147483647;

        for (int i = 1; i <= 5; i++) {

            System.out.println("enter number");
            int num = scan.nextInt();

            if (num < min) {
                min = num;
            }
            if(num > max){
                max = num;
            }

        }
        System.out.println("max number among those is: " + max);
        System.out.println("min number among those is: " + min);
    }
}
