package SelfPractices_Summer_B20.Interview_Questions.ready_for_sublime;

import java.util.Arrays;
import java.util.Scanner;

public class Max_And_Min_In_Array {
    public static void main(String[] args) {
        maxAndMinNum();
        System.out.println(minAndMaxValues1(new int[]{2, 7, 0, -65, 78, 11, 56, 122}));
        System.out.println(minAndMaxValues2(new int[]{2, 7, 0, -65, 78, 11, 56, 122}));
    }
    public static void maxAndMinNum() {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");

        int arrayLength = input.nextInt();
        int[] numbers = new int[arrayLength];
        int max = numbers[0], min = numbers[0];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter your number: ");
            numbers[i] = input.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("the largest number among your entries is: " + max +
                "\nthe smallest number among your entries is: " + min);
    }
    //===============================================//
    public static String minAndMaxValues1( int[]  n ) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int each: n) {
            if (each < min) {
                min = each;
            }
            if (each > max) {
                max = each;
            }
        }
        return "min number: "+min+" and max number: "+max;
    }

    public static String minAndMaxValues2( int[]  n ) {
        Arrays.sort( n );
        return "min number: "+n [ 0 ]+" and max number: "+n [n.length-1 ] ;
    }

}
