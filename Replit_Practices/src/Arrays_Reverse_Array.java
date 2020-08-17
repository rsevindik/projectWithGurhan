import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Reverse_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        Arrays.sort(nums);  // will be necessary if you want them in descending/ascending orders. if you only want to
                                // reverse current elements of the array then take it out.!
        int [] reversedNums = new int[nums.length]; //put length for the length of the arr not the indexes(-1 not okay.!!
        int x = nums.length-1;
        for (int i =0; i<= reversedNums.length-1; i++) {
            reversedNums [i] = nums[x];
            x--;

        }
        System.out.println(Arrays.toString(reversedNums));
        }


    }

/*
int[] arr ={ 10, 11, 8, 9, 12, 5, 15};
        Arrays.sort(arr); //arr: {1, 2, 3}
        System.out.println( Arrays.toString(arr));

        int[] desc = new int[arr.length];      // { 3, 2, 1}
            /*
            desc[0] =  arr[2];
             desc[1] =  arr[1];
             desc[2] =  arr[0];
        */
/*
    int k =arr.length-1;
        for(int i =0; i <= desc.length-1; i++ ){ //i: 0, 1, 2
                desc[i] =  arr[k];
                k--; // k: 2, 1, 0
                }
 */