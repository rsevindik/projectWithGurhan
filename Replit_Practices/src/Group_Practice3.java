import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Group_Practice3 {
    /*
    create a length int for the combined length of both arrays.
    create an array with that length (thats the array we will return).
    create an iterator for both arrays (int z=0).

    loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
    then increment the iterator for both arrays (z++).

    do the same for the second array.
     */
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        //mergR(arr1, arr2);
        System.out.println(mergR(arr1, arr2));


        }


    public static int[] mergR(int[] a, int[] b) {
        int[] mergedArray = new int[a.length + b.length];

        int z = 0;
        for (int i = 0; i <= mergedArray.length; i++) {
            mergedArray[z] = a[i];
            z++;

            for (int j = 0; j <= mergedArray.length; j++) {
                mergedArray[z] = b[i];
                z++;
            }

        }

        return mergedArray;


            }
        }




