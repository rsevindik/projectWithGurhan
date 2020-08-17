package Day19_ForLoop;
import java.util.Scanner;
public class CombineTwoStrings {
    public static void main(String[] args) {

/*
1. Ask user to enter two words. Then add them together and print. But if the last letter of the first
 word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

                Scanner scan = new Scanner(System.in);

                String str1 = scan.next();
                String str2 =  scan.next(); // ight
                // 01234

                // OneTwo
                char ch1 = str1.charAt( str1.length() -1 ); // last char from str1
                char ch2 = str2.charAt(0); //first char from str2

                if( ch1 == ch2  ){
                    System.out.println(str1 + str2.substring(1));  // excluding the first character of the second string
                }else{
                    System.out.println(str1 +str2);
                }


        String str1 = "Java is programming language";
        //             012

        String str2 =  "eight";
        //          01234


        /*
        // OneTwo
        char ch1 = str1.charAt( str1.length() -1 ); // last char from str1
        char ch2 = str2.charAt(0); //first char from str2
        if( ch1 == ch2  ){
            System.out.println(str1 + str2.substring(1));  // excluding the first character of the second string
        }else{
            System.out.println(str1 +str2);
        }

        String s1 = str1.substring( str1.length() -1 ); // "e"
        // substring(2 ) ==> e

        String s2 = str2.substring(0, 1);  // "e"

        if( s1.equals(s2) ) {
            System.out.println( str1 + str2.substring(1) );
        }else{
            System.out.println(str1 + str2);
        }

        System.out.println("=======================");
        String str1 = scan.next();
        //             012

        String str2 =  scan.next();
            //          01234

        // first:
        char ch1 = str1.charAt( str1.length() -1 ); // last char from str1
        char ch2 = str2.charAt(0); //first char from str2

        if( ch1 == ch2  ){
            System.out.println(str1 + str2.substring(1));  // excluding the first character of the second string
        }else{
            System.out.println(str1 +str2);
        }

        // second:
        String s1 = str1.substring( str1.length() -1 ); // "K"
                        // substring(2 ) ==> e

        String s2 = str2.substring(0, 1);  // "s"

        if( s1.equals(s2) ) {
            System.out.println( str1 + str2.substring(1) );
        }else{
            System.out.println(str1 + str2);
        }
        // third:
        String t1 ="" + str1.charAt( str1.length() -1 ); // last char from str1
        String t2= "" +  str2.charAt(0); //first char from str2

        if( t1.equals(t2)  ){
            System.out.println(str1 + str2.substring(1));  // excluding the first character of the second string
        }else{
            System.out.println(str1 +str2);
        }
         */

    }
}
