package ShortReviewVideos;

import java.util.Arrays;

public class Arrays_Practice {
    public static void main(String[] args) {
        /*
        syntax of arrays
        dataType [] variableName = new dataType[size];
         */

        int [] numbers = new int[3]; // there will be 3 elements with integer value

        //int  numbers2 []= new int[4]; [] can be written after or before the variable's name.!
        // if you take off equation on the right (int numbers2 [];) would work as well(C-style declaration????

        numbers[0] = 2; // declaring variable and assigning the values
        numbers[1]= 5;
        numbers[2]= 7;
/*
        below is the way how you can also declare and assign value without indicating the size(capacity of the array.!!
 */

        int[] numbers4 = {7,11,34,42}; // easiest one.!
        System.out.println("Numbers: "+numbers4); // returns [I@72ea2f77 (not meaningful.!)

        int [] numbers3 = new int [] {4,9,12};
        System.out.println(""+numbers3[1]+ numbers3[0]+numbers3[2]); // returns each num with designated index num.

        String [] names = new String[] {"John", "Adam", "Don"};
        System.out.println("Second name: "+names[1]); // Adam

        String [] names2 = {"Ali", "Erdem", "Ramazan"};

        System.out.println("Third name: "+names2[2]);  //Ramazan

        //Example1:
        int [] intArray = {2,5,7};

        System.out.println("Numbers 1: "+ intArray[0]); //2
        System.out.println("Numbers 2: "+ intArray[1]); //5
        System.out.println("Numbers 3: "+ intArray[2]); //7

        //Example2: looping an array
        String [] names3 = {"John", "Adam", "Don"};
        for (int i = 0; i <= names3.length-1; i++) {    // let's try i<= names3.length-1
            System.out.println("Names "+ names3[i]);
        }
        //Example3: looping an array for EACH LOOP
        String [] names4 = {"Joe", "Adam", "Dixie"};
        for (String item : names4) {
            System.out.println("Names "+ item);
        }

        }
    }

