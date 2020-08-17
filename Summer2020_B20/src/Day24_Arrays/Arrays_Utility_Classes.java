package Day24_Arrays;

import java.util.Arrays;

public class Arrays_Utility_Classes {
    public static void main(String[] args) {
        int []arr = {1,2,3};

        System.out.println(arr); //hashcode (not meaningfull. We have to converted to String.!
        System.out.println(Arrays.toString(arr));

        String [] names = {"ali", "erdem", "ramazan"};
        System.out.println(Arrays.toString(names));

        System.out.println("===============================");

        int [] nums = {5,4,6,5,4,3,10};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Maximum number is "+nums[nums.length-1]);
        System.out.println("Minimum number is "+nums[0]);

        System.out.println("=========================");

        String students [] = {"ali", "veli", "ozan", "gizmo"};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("================================");

        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1, arr2);

        System.out.println(r1);

        int arr3 [] = {2,1,3};

        Arrays.sort(arr2);
        Arrays.sort(arr3);

        boolean r2 = Arrays.equals(arr2,arr3);
        System.out.println(r2);

        int[] arr4 = {1,2,3,2};
        int[] arr5 = {1,2,3};

        boolean r3 = Arrays.equals(arr4, arr5);
        System.out.println(r3);


    }



}
