package com.Coding.Udemy;

public class HelloWorld {
    public static void main(String[] args) { // between left and right curly braces is called class body and it includes all the data and codes!

        System.out.println("Hello, Ramadan");

        int myFirstNumber = (5 + 3) + (2*10);
        int mySecondNumber = myFirstNumber * 2;
        int myThirdNumber = mySecondNumber / 3;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myTotal); // "" (String literal) are not being used it's value does not change print exactly what it says

        int myLastNumber = 1000 - myTotal;
        System.out.println(myLastNumber);


    }



}
