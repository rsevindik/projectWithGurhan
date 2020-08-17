package Day28_Recaps;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int [] arr1d = {1,2,3};


        int [][] arr2d = { {1,2,3},{4,5,6,7,8},{9,10,11,12,13} };

        Arrays.toString(arr2d [1]); // you can simply print it with in the print statement

        System.out.println(Arrays.toString(arr2d [1]));

        System.out.println(Arrays.deepToString(arr2d));

        System.out.println(arr2d[1][3]);

        System.out.println("========================");

            for (int i = 0; i <= arr2d.length-1 ; i++) { // iterates single dimensional arrays
            int[] each1DArray = arr2d[i];
            System.out.println(Arrays.toString(each1DArray));

            for (int j = 0; j <= each1DArray.length-1 ; j++) {  //inner loop iterates single dimensional elements
                int eachNum = each1DArray[j];
                if (eachNum % 2 == 0) {
                    System.out.println(eachNum + "");
                }
            }
            System.out.println();
            System.out.println("===============================");

            for ( int [] each1D : arr2d ) {
                for (int eachElement : each1D) {
                    if(eachElement%2 !=0){
                        System.out.println(eachElement+" ");
                    }
                }
                System.out.println();  // to print each array in new/next line
            }
        }
    }
}
