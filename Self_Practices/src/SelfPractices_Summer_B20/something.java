package SelfPractices_Summer_B20;

import java.util.Scanner;

public class something {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    /*
      int x = 10, y = x++; //y=10

        System.out.println(y++ +" "+ x++ + " "+ +y);
        //                 10 + "" + 10 + " " + 11

     */

        System.out.println("Enter your text!");
        String word = input.nextLine();
        int wordLength = word.length();

        if (wordLength == 0) {
            System.out.println("String is Empty!");
        } else if (wordLength >= 3) {
            System.out.println(word.substring(wordLength - 3));
        } else {
            System.out.println(word);
        }
    }
}
