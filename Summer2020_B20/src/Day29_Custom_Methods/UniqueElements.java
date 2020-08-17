package Day29_Custom_Methods;

import Office_Hours.Practice_07_14_2020.Unique;

public class UniqueElements {

    public static void main(String[] args) {
        String [] arr = {"A", "A", "B", "C", "C", "E", "F"};
        uniques(arr);

        System.out.println("hello");

        String [] arr2 = {"D", "D", "E","F","F"};
        uniques(arr2);
    }


    public static void uniques(String [] arr){

        for( String a : arr){   // gets each of the elements

            int count = 0;
            for( String each : arr){   // gets the frequency of the elements
                if(a.equals(each)){
                    count++;
                }

            }
            if(count == 1){ // unique
                System.out.print(a+" ");
            }
        }
        System.out.println();
    }


}
