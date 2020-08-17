package Day22_NestedLoop;

import java.util.Scanner;
/*
 1. Write a program that asks user to enter a string. If string started with uppercase and ends with lowercase letter
 then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
 */

public class Upper_Lower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  a String");
        String word = input.next();

        char chFirst = word.charAt(0);
        char chLast = word.charAt(word.length()-1);

        boolean start = chFirst >='A' && chFirst <= 'Z';
        boolean end = chLast >='a' && chFirst <= 'z';

       // System.out.println(start && end);
            if(start && end){
            System.out.println("true");
            }else{
            System.out.println("False");
        }

    }
}
