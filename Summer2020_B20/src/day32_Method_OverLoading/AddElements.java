package day32_Method_OverLoading;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int [] arr = {1,2,3};
        int num = 4;

        int [] arr2 = new int [arr.length+1];
        arr2[arr2.length-1] = num;   // assigning the additional number as last index

        int i =0;
        for (int each : arr) {
            arr2[i] = each;

            i++;
        }
        

        System.out.println(Arrays.toString(arr2));

        System.out.println("===========================");

        int [] scores = {85, 65, 45, 55, 95};
        int additionalNum = 87;

        scores = addElement(scores, additionalNum);

        Arrays.sort(scores);   // additional step if ascending order needed.!

        System.out.println(Arrays.toString(scores));






    } /** end of the main method  */


    public static int [] addElement(int [] arr, int num){

        int [] arr2 = new int [arr.length+1];
        arr2[arr2.length-1] = num;   // assigning the additional number as last index

        int i =0;
        for (int each : arr) {
            arr2[i] = each;

            i++;
        }
        return arr2;
    }




}
