package ShortReviewVideos;

import java.util.Arrays;

/*
Arrays class from java.util package for common operations (import jva.util.Arrays;
 */
public class SortingArray_BinarySearch {

    public static void main(String[] args) {

        int[]targetArrayObject = {111,4,6};
        int targetItemToSearch = 4;

        Arrays.sort(targetArrayObject); // 4,6,11
        Arrays.binarySearch(targetArrayObject, targetItemToSearch); // 0  (allow you to search a specific element
                                                                    // within your array if the array already sorted.!!
        Arrays.toString(targetArrayObject); // [4,6,11]

        System.out.println("=======Examples===========");

        int [] intArray = {2,15,7,1,3};
        // syntax for SORTING AN ARRAY elements and after putting them in order their index numbers will be changed.!
        Arrays.sort(intArray);

        for (int item : intArray) {
            System.out.println("numbers " +item);
        }
        // GETTING STRING VALUE OF ARRAY ITEMS
        int [] ints = {2,15,7,1,3};
        Arrays.sort(ints);
        //syntax for sorting array elements
        System.out.println(Arrays.toString(ints));

        System.out.println(ints); //[I@1fb3ebeb

        //Sorting a string array
        String [] names = {"John","Adam","Don"};
        // syntax for SORTING AN ARRAY elements and after putting them in order their index numbers will be changed.!
        Arrays.sort(names);

        for (String item : names) {
            System.out.println("names " +item);
        }

        //Using binary search
        int [] integers = {2,5,7,14};  // syntax for accessing Array elements which are already sorted.!

        System.out.println(Arrays.binarySearch(integers,2)); // 0 means the first element with index#0
        System.out.println(Arrays.binarySearch(integers,7)); // 2 means the 3rd element with index#2
        System.out.println(Arrays.binarySearch(integers,9)); // -4 means if it was among the array's element it
                                                                    // would then be the first element with index#4
        System.out.println(Arrays.binarySearch(integers,15));//-5 again would be the 5th element but does not exist

        }

    }

