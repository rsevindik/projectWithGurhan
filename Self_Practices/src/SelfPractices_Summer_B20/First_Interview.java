package SelfPractices_Summer_B20;

import java.util.Arrays;
import java.util.Scanner;

public class First_Interview {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers, one at a time, please");

        int [] numArr = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()} ;

        int minNum = numArr [0];
        int maxNum = numArr [0];

        for (int i = 1; i < numArr.length ; i++) {
            if(numArr [i] < minNum){
                minNum = numArr[i];

            }
            if(numArr [i] > maxNum){
                maxNum = numArr[i];

            }

        }

        System.out.println(minNum);
        System.out.println(maxNum);

        System.out.println("==============================");

         */
/*
        int nums [] = {1,2,3,4,5};

        int [] reversedNums = new int [nums.length];

        int k = 0;
        for (int i = nums.length-1; i >= 0 ; i--) {
            reversedNums[k] = nums[i];
            k++;
        }
        System.out.println(Arrays.toString(reversedNums));

        System.out.println("===========task -2============");

 */

        String givenInfo = "Today's date is 04/27/2020";
        String nums = "";

        char [] ch = givenInfo.toCharArray();
        int sum=0;
        for( char each : ch){
            if(each >= 48 && each <= 57){
                sum += Integer.parseInt(""+each);
            }
            }

        System.out.println(sum);

        }

           }








