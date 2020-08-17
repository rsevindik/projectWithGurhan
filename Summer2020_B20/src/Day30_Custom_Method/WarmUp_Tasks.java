package Day30_Custom_Method;

import java.util.Arrays;

/*
wamrmup tasks:
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop
methods: function. grouping code fragments

        Access-modifier  Specifier  return-type  methodName(parameter){
                statements;
        }
        Access-modifer: public
        specifier: static
        parameter: any dataType
        methodName (Mandatory): can be any name
        return-Type(Mandatory) : void,  DataType
 */
public class WarmUp_Tasks {
    public static void main(String[] args) {

        maxNum(123,123);   // must match with parameter data type with the same order.!

        int arr[]={5,2,3,4,5,6,4,7,0,-5,-54,-55,-5,54,-45,-45,-45,};

        printDesc(arr);

        int [] a1 = {1,2,3,4,5};
        int [] a2 = {6,7,8,9,10,11,12,13,13,14};

        combine2Arrays(a1,a2);

        PosNegZero(00);
        System.out.println("======================");

        int[]a3 = {100, 30,0,-45,79,-500};

        for(  int each : a3){

            PosNegZero(each);
        }

    }

    //task-1: create a function that can print out the maximum number between two numbers

    public static void maxNum(int a, int b){ // for this task parameters are required (arguments after we run program)

       if(a==b){
           System.out.println("equal");
           return;     // only exiting the method just like break for the loop and switch.!
       }
       if(a>=b){
           System.out.println(a+" is maximum");
       }else{
           System.out.println(b+" is max");
       }

    }

    // task-2: create a function that can print out the array of integers in descending order

    public static void printDesc(int [] arr){      //{10,9,20,30,5,6,7};
        Arrays.sort(arr); // {5,6,7,9,10,20,30}

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        }

// task-3:create a function that can print out the combination of two integer arrays
    public static void combine2Arrays(int [] arr1, int [] arr2){
        int [] arr3 = new int [arr1.length + arr2.length];
        int index =0;
        for( int each   : arr1  ){
            arr3[index]=each;
            index++;
        }
        for( int each : arr2){
            arr3[index] = each;
            index++;
        }
        System.out.println(Arrays.toString(arr3));
    }

    //task4: step1: create a function that can check if the given integer is positive, negative or zero
    //        step2: Use the above method to  write a program that can check every single elements of an array of Integers
    //        MUST use for each loop

    public static void PosNegZero (int num){

        if(num > 0){
            System.out.println(num+" is positive");
        }else if(num<0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }


    }



}
