package Day16_String;

import java.util.Scanner;

public class FirstLAstChars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);
       // System.out.println(firstChar == lastChar);
        String result ="";

        if(firstChar == lastChar ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println("========or==========");

        result = (firstChar == lastChar)? "true" : "false";
        System.out.println(result);
        input.close();
    }
}
