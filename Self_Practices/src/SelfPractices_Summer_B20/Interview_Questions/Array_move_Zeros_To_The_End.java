package SelfPractices_Summer_B20.Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_move_Zeros_To_The_End {

    public static void main(String[] args) {
        System.out.println("moveZeros(new int[] {2, 7, 0, 4, 0, 2, 1, 0, 4}) = " +
                Arrays.toString(moveZerosToTheEnd(new int[]{2, 7, 0, 4, 0, 2, 1, 0, 4})));
        // ============================================= //
        int[] nums = {5, 4, 0, 0, 2, 0, 1, 0};
        int[] result = new int[nums.length];
        int lastIndex = result.length-1;
        int firstIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (nums[i] != 0){
                result[firstIndex] = nums[i];
                firstIndex++;
            }else {
                result[lastIndex] = nums[i];
                lastIndex--;
            }
        }
        System.out.println(Arrays.toString(result));
        // ============================================= //

        int[] arr1 = {2, 7, 0, 4, 0, 2, 1, 0, 4};
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                arr1[count++] = arr1[i];
            }
        }
        while (count < arr1.length) {
            arr1[count++] = 0;
        }
        System.out.println(Arrays.toString(arr1));
    }
    // ============================================ //

        public static int[] moveZerosToTheEnd( int[]  arr2 ) {

            ArrayList<Integer> list = new ArrayList<>();

            int countZero = 0;

            for(int each: arr2) {

                list.add(each);

                countZero+= (each==0)?1:0;
            }
            list.removeAll(Arrays.asList(0));

            arr2 = new int[arr2.length];

            for(int i=0; i <arr2.length-countZero; i++ ) {

                arr2[i] = list.get(i);
            }
            return arr2;
        }
}
