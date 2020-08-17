import java.util.Scanner;

public class Arrays_Print_First_LastChar_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below

        for (int i = 0; i <=4 ; i++) {
           String word = words[i];
            System.out.println(""+word.charAt(0)+word.charAt(word.length()-1));
        }
        /*  below: manual testing.!
        String word1 = words[0];
        String word2 = words[1];
        String word3 = words[2];
        String word4 = words[3];
        String word5 = words[4];

       System.out.println(""+word1.charAt(0)+word1.charAt(word1.length()-1));
       System.out.println(""+word2.charAt(0)+word2.charAt(word2.length()-1));
       System.out.println(""+word3.charAt(0)+word3.charAt(word3.length()-1));
       System.out.println(""+word4.charAt(0)+word4.charAt(word4.length()-1));
       System.out.println(""+word5.charAt(0)+word5.charAt(word5.length()-1));
       */

    }
}
