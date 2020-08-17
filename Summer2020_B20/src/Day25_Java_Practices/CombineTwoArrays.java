package Day25_Java_Practices;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {2, 1, 5};
        int[] arr2 = {3, 4};

        int[] arrCombined = new int[arr1.length + arr2.length];//size of the new arr which is combination of two arrays
       /*
       arr3[0] = arr1[0];
       arr3[1] = arr1[1];
       arr3[2] = arr1[2];
       arr3[3] = arr2[0];
       arr3[4] = arr2[1];
        */

        int index = 0;

        for (int each : arr1) {
            arrCombined[index] = each;
            index += 1;
        }
        for (int each : arr2) {
            arrCombined[index] = each;
            index++;

        }
        System.out.println(Arrays.toString(arrCombined));

        Arrays.sort(arrCombined);

        System.out.println(Arrays.toString(arrCombined) );

        System.out.println("Maximum size of the array: "+arrCombined[arrCombined.length-1]);




    }
}
