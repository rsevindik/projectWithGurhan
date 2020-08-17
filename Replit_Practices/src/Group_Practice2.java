import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Group_Practice2 {
/*
Create a method that gets an array of strings and a string, the method returns an int.

It counts how many times a string appears in the array and returns the count.

for example (pseudo code):

some_array = ["a","foo","bar","foo","bla"]

some_string = "foo"

count_appearance(some_array ,some_string )
 */
public static void main(String[] args) {
    String []  strArray = {"a","foo","bar","foo","bla"};
    String str1 = "foo";

    System.out.println(count_appearance(strArray , str1));

}/** end of main method   */

public static int count_appearance(String [] Array , String str){
   String []  strArray = {"a","foo","bar","foo","bla"};

   String str1 = "foo";

   int count = 0;
   for( String each  : strArray){
       if(each.equalsIgnoreCase("foo") ){
           count++;
       }
   }

    return count;
}

}/** end of class   */
