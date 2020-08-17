import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Print_Letters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        int firstLetter = alphabets.indexOf(start);
        int lastLetter = alphabets.indexOf(end);

        String newAlphabet = alphabets.substring(firstLetter, lastLetter+1);


        System.out.println(newAlphabet);
        }

    }

