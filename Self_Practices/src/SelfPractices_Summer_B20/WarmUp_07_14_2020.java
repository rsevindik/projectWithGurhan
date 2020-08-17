package SelfPractices_Summer_B20;

import java.util.Arrays;

/*
7. write a program that can sort the array in descending order
        ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};
            output:
                arr2: {15, 12, 11, 10, 9, 8, 5}
            NOTE: at the end, you must have have an array that contains the descending order of the original array
 */
public class WarmUp_07_14_2020 {

    public static void main(String[] args) {

        int [] arr = { 10, 11, 8, 9, 12, 5, 15};

        Arrays.sort(arr);

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }

        }

    }

