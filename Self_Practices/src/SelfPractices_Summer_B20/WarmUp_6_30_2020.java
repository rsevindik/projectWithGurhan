package SelfPractices_Summer_B20;

import java.util.Scanner;

public class WarmUp_6_30_2020 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
/*
        System.out.println("Enter your first word: ");
        String word1 = keyboard.next();
        int lengthOfWord1 = word1.length();

        System.out.println("Enter your second word: ");
        String word2 = keyboard.next();

        char lastLetterOfWord1 = word1.charAt(lengthOfWord1-1);
        char firstLetterOfWord2 = word2.charAt(0);

        if(lastLetterOfWord1 == firstLetterOfWord2){
            System.out.println(""+lastLetterOfWord1+firstLetterOfWord2);
        }else{
            System.out.println(""+word1+" "+word2);
        }
        System.out.println("==============task-2=================");

        System.out.println("Enter your first name: ");
        String firstName = keyboard.next();

        System.out.println("Enter your last name: ");
        String lastName = keyboard.next();

        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

            System.out.println("your initials are: "+firstInitial+". "+lastInitial+".");

        System.out.println("==============task-3=================");

        String magicWord = "Java";
        //      index num   0123

        System.out.println(""+magicWord.charAt(3)+magicWord.charAt(2)+magicWord.charAt(1)+magicWord.charAt(0));

        // turn "Java" into "avaJ"; J moves to the end.!!
        //index  0123

        System.out.println(""+magicWord.substring(1) + magicWord.substring(0,1));
        // for the second for also you can use charAt method.. magicWord.charAt(0));


        System.out.println("==============task-4=================");

        String domain = "the domain of the email is: gmail";

        domain = domain.replace("gmail", "yahoo");

        System.out.println(domain);

        System.out.println("==============task-5=================");

        System.out.println("Enter your word: ");
        String word = keyboard.next();

        boolean containsX = word.contains("x");
        boolean startsWithX = word.startsWith("x");

        if(containsX && startsWithX){
            System.out.println(word.substring(1));
        }else{
            System.out.println("your word does not contain word: 'x'");
        }
*/
        System.out.println("==============task-6=================");
/*
Ask user to enter a word. If the first or second or both letter of the word is x, print the word without x(s). If x is the third letter it should be printed. If the first and second are x, both should be ignored.
                    Input:
                        xxode
                    Output:
                        ode
                    Input:
                        oxidex
                    Output:
                        oidex

 */
        System.out.println("Enter your word: ");
        String word = keyboard.next();

        boolean isFirstLetterX = word.charAt(0) == 'x' || word.charAt(0) == 'X';
        boolean isSecondLetterX = word.charAt(1) == 'x' || word.charAt(1) == 'X';
        String result = " ";

        if(isFirstLetterX && !isSecondLetterX){
            result =word.substring(1);
        }
        else if(isSecondLetterX && !isFirstLetterX){
            result =(word.substring(0,1)+word.substring(2));
        }
        else if(isFirstLetterX && isSecondLetterX){
            result =word.substring(2);
        }else{
            result = word;
        }
        System.out.println(result);
    }
}
