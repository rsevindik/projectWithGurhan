package com.Coding.Udemy;

public class CharAndBoolean {

    public static void main(java.lang.String[] args) {

        char myChar = 'D'; // only one character variable within '...' (not double "")occupies 2 bytes=16 bits memory
        char myUnicodeChar = '\u0044'; // 40 is the unicode for D but also (..) will be used to call this code!!
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;


    }
}
