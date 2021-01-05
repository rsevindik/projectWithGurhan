package SelfPractices_Summer_B20.Interview_Questions.interview_practice_with_rahul;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice_1 {
    public static void main(String[] args) {
        // System.out.println("sumArray(new int [] {1,2,3,4,5}) = " + sumArray(new int[]{1, 2, 3, 4, 5}));
        // System.out.println("multiply(4,7) = " + multiply(4, 7));
        //System.out.println(adjacentArray(new int[]{1, 4, 8, 15, 17, 99}));
       // compareArrays(new int[]{1, 3, 8, 7, 17, 44}, new int[]{1, 4, 8, 15, 17, 99});
        sortArray(new int[] {3,8,2,0,9,1,6});
    }

    public static int sumArray(int[] a) { // a method accepts array returns sum of its elements
        int sum = 0;
        for (int each : a) {
            sum += each;
        }
        return sum;
    }

    public static int multiply(int a, int b) { // a method multiply numbers without math operators
        int result = 0;
        //  result = a * b; ***** Do NOT use the math operations but only the logic ****
        int k = 1;
        while (k <= b) { // iterates the number of second variable to be able to add first variable's value itself that many times
            result += a; // adding a to the result b times .!
            k++;
        }
        return result;
    }

    public static int adjacentArray(int[] arr) { // subtract each pairs of elements in array and give the max difference
        int maxDifference = 0;
        int subtractNums = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            subtractNums = arr[i + 1] - arr[i];
            if (subtractNums > maxDifference) {
                maxDifference = subtractNums;
            }
        }
        return maxDifference;
    }

    public static void compareArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                arrayList.add(arr1[i]);
            }
        }
        /*
        Object [] c = arrayList.toArray();
        for ( Object  each    : c){
            System.out.print(each+" ");
        }
         */
        for ( int each : arrayList)
        System.out.print(each+" ");      // 1 8 17
//        System.out.println((arrayList)); // [1, 8, 17]
    }
    public static void sortArray(int [] nums){
       // int[] arr ={3,8,2,0,9,1,6};  compare each element swap if following element is smaller
        int temp;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i] > nums[j]){ // swapping num if following num is smaller ">" for asc order
                    temp = nums[i];   // swapping num if following num is bigger "<" for desc order
                    nums[i]=nums[j];
                    nums[j]=temp;
                    /* a=3, b=5  swapping without temp variable
                    a=a+b; // a=8
                    b=a-b; // b=8-5=3
                    a=a-b; // a=8-3=5

        // in one line; b=a+b-(a=b);
                     */
                }
            }
        }
            for (int each : nums){
            System.out.println(each);
        }
    }





}



