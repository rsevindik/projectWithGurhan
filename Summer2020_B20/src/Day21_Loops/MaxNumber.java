package Day21_Loops;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648; // or you can go with -99999999999 (until it gets excepted.!)

        for (int i = 10; i <= 50 ; i+=10) {

            System.out.println("enter number");
            int num = scan.nextInt();

            if(num > max){
                max = num;
            }

        }
        System.out.println("max number among those is: " +max);


    }
}
