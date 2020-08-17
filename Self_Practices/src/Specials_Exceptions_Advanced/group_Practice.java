package Specials_Exceptions_Advanced;

import java.util.Arrays;

public class group_Practice {
    public static void main(String[] args) {

        //assinging min number t the first place and replace it with

        int a [] = {3,9,4,1,2,6,8,5,7};


        int num = 0;
        int min = a [0];
        int size = a.length;

        for(int i = 1; i< size; i++){
            if(a[i] < min){
                min = a[i];
               num = i;
            }
        }
        a[num] = a[0];
        a[0] = min;
        System.out.println(Arrays.toString(a));

        System.out.println("=================================");

        //assinging min number t the first place and replace it with

     //   int a [] = {3,9,4,1,2,6,8,5,7};

/*
        int k,i,size, num = 0;
        int min = b [0];
        int size = b.length;

        for (int i = 0; i < ; i++) {

        }
        for(int i = 0; i< size-1; i++){
            if(a[i] < min){
                min = a[i];
                indexNum = i;
            }
        }
        a[num] = a[0];
        a[0] = min;
        System.out.println(Arrays.toString(a));

 */



    }
}
