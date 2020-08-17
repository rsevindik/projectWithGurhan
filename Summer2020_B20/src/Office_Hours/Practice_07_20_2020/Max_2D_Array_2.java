package Office_Hours.Practice_07_20_2020;

import java.util.Arrays;

public class Max_2D_Array_2 {
    public static void main(String[] args) {
        int [][] arr2D = {{1,2,3} , {4,5,6,7}  , {8,9,10,11,12}};

        int max = arr2D[0][0];

        for( int [] each1D  : arr2D){    // to get each 1D array
          //  System.out.println(Arrays.toString(each1D));
            for( int eachNum  : each1D){   // to get each element

                if(eachNum > max){
                    max = eachNum;
                }

            }

        }

        System.out.println("Maximum num: "+max);
    }
}
