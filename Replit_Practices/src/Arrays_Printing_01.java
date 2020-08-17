import java.util.Scanner;

public class Arrays_Printing_01 {
    public static void main(String[] args) {
        /*
        The code provided in your main method will take in five Strings and save them into an array called arr.
        Print out the first three letters of each element of arr, one per line.  You can assume that every element
        of arr is at least 3 letters long.
         */
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++){
            arr[i] = input.nextLine();
            System.out.println(arr[i].substring(0,3));
        }
        //leave above alone! :)
        //assume you have String array of 5 items
        //write your code below:

    }
}
