package Day26_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {

        char [] ch1 = {'A', 'B'};
        char [] ch2 = {'C', 'D', 'E'};
        char [] ch3 = {'F', 'G', 'H'};

        //                   0    1       0    1   2        0    1    2
        char[][]  ch2D = { {'A', 'B'},  {'C', 'D', 'E'},  {'F', 'G', 'H'} };
        //                      0               1                  2
        System.out.println(Arrays.toString(ch2D[1])); //we need toString for only printing all the elements in the array
        System.out.println(  Arrays.toString( ch2D[2]  )  );
        // H
        System.out.println( ch2D[2][2] );// if only printing a specific element no need for toString method.!
        // C
        System.out.println( ch2D[1][0] );
        // G  B
        System.out.println( ch2D[2][1]+"    "+  ch2D[0][1] );

        System.out.println("=================================");

        //{1,2,3} , {4} , {5,6},{7,8,9,10}
        //   int[] arr1D = {  {1,2,3}  };

        int [][] arrCombined = {{1,2,3}, {4}, {5,6}, {7,8,9,10}};
        //                   0        1      2          3
        // [7,8,9, 10]
        //  System.out.println(  Arrays.toString( nums[3] ) );

        /*
        {1,2,3}
        {4}
        {5,6}
        [7,8,9, 10]
         */
        System.out.println(Arrays.toString(arrCombined[3]));  // will print out the last array in the 2 dimensional array

        for(int arrSingle [] : arrCombined){
            System.out.println(Arrays.toString(arrSingle)); // will return prints of each array.!
        }

        for (int i = 0; i <=arrCombined.length-1 ; i++) {
            System.out.println(Arrays.toString(arrCombined[i])); // will print [1, 2, 3] [4] [5, 6] [7, 8, 9, 10]
        }

        System.out.println("======deepToString: prints all inner arrays of multiD array======");

        System.out.println( Arrays.deepToString(arrCombined));




    }
}
