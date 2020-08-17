import java.util.Arrays;
import java.util.Scanner;
/*
arr -> ["apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"]
 prints:  apple , banana
          kiwi , grape
          milk, "soda"
          juice, coffee
 */
public class Arrays_Printing_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 8 items
        //and print two items at a time in 4 line
        //write your code below
        for (int i = 0; i <8 ; i+=2) {
           String newArr =  arr[i]+", "+arr[i+1];
            System.out.println(newArr);


        }

    }
}
