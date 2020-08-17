package SelfPractices_Summer_B20;

import java.util.Scanner;

public class WarmUp_7_4_2020 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if(i%15 ==0){
                System.out.println(i+" FINRA");
            }
            else if(i%3 == 0){
                System.out.println(i+" FIN");
            }else{
                System.out.println(i+" RA");
            }
        }
        System.out.println("=============================");

        for (int i = 1; i <=8 ; i++) {
            System.out.println("\t\t\t* * * * * *");
        }

        System.out.println("=============================");

        System.out.println("\t\t\t* * * * * *");
        for (int i = 1; i <=8 ; i++) {
            System.out.println("\t\t\t*         *");
        }
        System.out.println("\t\t\t* * * * * *");

        System.out.println("=============================");

        int sum = 0;

        for (int i = 1; i <=100 ; i++) {
             sum=sum+i;
        }
        System.out.println("sum of the numbers between 1 and 100: "+sum);

        System.out.println("=============================");

        int evenSum = 0;

        for (int i = 2; i <=100 ; i+=2) {
            evenSum=evenSum+i;
        }
        System.out.println("sum of the EVEN numbers between 1 and 100: "+evenSum);

        System.out.println("=============================");

        int oddSum = 0;

        for (int i = 1; i <=100 ; i+=2) {
            oddSum=oddSum+i;
        }
        System.out.println("sum of the ODD numbers between 1 and 100: "+oddSum);

        System.out.println("=============================");

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number that you would like to get the sum of all numbers between 1 and your number");
        int givenNumber = input.nextInt();
        int givenSum = 0;

        for (int i = 1; i <=givenNumber ; i++) {
            givenSum=givenSum+i;
        }
        System.out.println("sum of the numbers between 1 and "+givenNumber+" is: "+givenSum);
    }
}
