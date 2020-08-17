package Day29_Custom_Methods;

public class Uniques {
    public static void main(String[] args) {
        /*
1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
 */

        String [] arr = {"A", "A", "B", "C", "C", "E", "F"};

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

    }
}
