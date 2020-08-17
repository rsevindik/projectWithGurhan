package Day16_String;

import java.util.Scanner;

public class EqualWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String word1 = input.next();

        System.out.println("Enter the second word: ");
        String word2 = input.next();

       // if(word1.equals(word2)){

        String result = (word1.equalsIgnoreCase(word2))? "Equal":"Not Equal";

        System.out.println(result);
    }
}
