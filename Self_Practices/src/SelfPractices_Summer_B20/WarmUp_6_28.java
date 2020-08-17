package SelfPractices_Summer_B20;

import java.util.Scanner;

public class WarmUp_6_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
        System.out.println("Enter two words one at a time and hit the enter!");
        String word1 = input.next();
        String word2 = input.next();

        int lengthWord1 = word1.length();
        int lengthWord2 = word2.length();

        String sW1 = word1.substring(1);
        String sW2 = word2.substring(1);

        System.out.println(""+sW1+sW2);

        System.out.println("==========Task-2===============");

        System.out.println("Enter your word!");
        String word = input.next();
        int wordLength = word.length();

        if(wordLength%2==0){   // including "0 as index number, this wil give you odd number of letters!!
            System.out.println(""+word.charAt(wordLength/2-1)+ word.charAt(wordLength/2));
        }else{
            System.out.println(""+word.charAt(wordLength/2));
        }

        System.out.println("==========Task-3===============");

        System.out.println("Enter your word!");
        String word = input.next();
        int wordLength = word.length();
        char chFirst = word.charAt(0);
        char chLast = word.charAt(wordLength-1);  // do not forget "0" which needs to be excluded while calling the last letter.!
        boolean sameChar = chFirst == chLast;

        if(sameChar){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

         4. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than 3 characters, print the string itself
        5. Write a program  CheckWords:
        Program accepts 3 words and :
        - if they are same length:      print "All words are same length"
        - if some same length and others not:    print "Not Same nor Different lengths"
        - if all different length :  print "All different length"


        System.out.println("==========Task-4===============");

        System.out.println("Enter your text!");
        String word = input.nextLine();
        int wordLength = word.length();

        if(wordLength==0){
            System.out.println("String is Empty!");
        }else if(wordLength >= 3){
            System.out.println(word.substring(wordLength -3));
        }else{
            System.out.println(word);
        }
        String result = (word.length() == 0) ? "empty string"
                : (word.length() > 3) ? word.substring( word.length()-3 ) : word ;


        System.out.println(result);
*/

        System.out.println("==========Task-5===============");
        System.out.println("Enter two words one at a time and hit the enter!");
        String word1 = input.next();
        String word2 = input.next();

        int lengthWord1 = word1.length();
        int lengthWord2 = word2.length();


    }
}
