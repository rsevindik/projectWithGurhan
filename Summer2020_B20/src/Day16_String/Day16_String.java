package Day16_String;

import java.util.Scanner;

public class Day16_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*
        System.out.println("Enter the first word: ");
        String word1 = scan.next();

        System.out.println("Enter the second word: ");
        String word2 = scan.next();

       // String result = word1.substring(1).concat(word2.substring(1));
        String result = word1.substring(1)+ word2.substring(1);   // create a new String.!!!!

        System.out.println(result);

 */
        String str = "I like to drink Pepsi";
        String brand = str.substring(16);
        System.out.println(brand);

        String verb = str.substring(10, 15);  //15 = 14+1 (ending letter is not included)
        System.out.println(verb);

    }
}
