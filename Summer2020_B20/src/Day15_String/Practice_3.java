package Day15_String;

import java.util.Scanner;

public class Practice_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your sentence: ");
        String sentence = input.nextLine();

        int lastIndexNum = sentence.length()-1;
        //  System.out.println(sentence.charAt(0) + sentence.charAt(lastIndexNum));
        //  will only give you ascii corresponding numbers(184), there for you need to convert one of the char to string
        System.out.println(sentence.charAt(0) + sentence.charAt(lastIndexNum));
    }
}
