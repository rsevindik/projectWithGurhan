package Day33_LocalDateTime;

import java.util.Arrays;

public class Calculate {

    public static void main(String[] args) {

        int a = 10;
        double b = 20;

        System.out.println(addition(a,(int)b));

        float num1 = 10;
        float num2 = 9;

        System.out.println(addition(num1, num2));   // using double - addition method

        System.out.println(addition(0.5, 2));

        int [] arr1 = {4,3,2,1};
        Arrays.sort(arr1);

        char[] arr2 = {'C','B', 'A'};
        Arrays.sort(arr2);




    }/** Ending main method line  */


    public static int addition (int a, int b){
        return a+b;

    }

    public static double addition(double a, double b){
        return a+b;
    }

    public static double addition(double a, int b){
        return a+b;
    }

    public static int multiplication(int a, int b){
        return a*b;
    }

    public static double multiplication(double a, double b){
        return a*b;
    }




}/** Ending class line  */
