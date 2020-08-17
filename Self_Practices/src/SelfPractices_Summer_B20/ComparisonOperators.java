package SelfPractices_Summer_B20;

import java.sql.SQLOutput;

public class ComparisonOperators {

    public static void main(String[] args) {

        int n1 = 50;
        int n2 = 55;

        System.out.println(n1<n2);       //true
        System.out.println(n1<=n2);      // true

        double price1 = 45.32;
        double price2 = 66.33;
        boolean test = price1 != price2;

        System.out.println(test);        // true

        System.out.println(n2 > price2); // false

     //   System.out.println(n2 > test);   compile error: int cannot be used with boolean

        char letter1 = 'A';     // according to the unicode-ascii table B comes after A
        char letter2 = 'B';     // meaning that B is greater than A.

        System.out.println(letter1 < letter2); // true
        System.out.println(letter1 > letter2); // false

        boolean b1 = letter1 > letter2;  // true
        boolean b2 = letter2 > letter1;  // false

        boolean b3 = b1 == b2;
        System.out.println(b3);   // false

        boolean b4 = b1 != b2;
        System.out.println(b4);   // true, because b1 is NOT equal to b2 !!


        int x = 56;
        if(x < 42) {
            System.out.println("Hi");
                }
        else {
            System.out.println("Bye");
        }

        int a = 5-4;
        double b = 5.0-4.0;

        if (a == b){
            System.out.println("They are equal in java's eyes.!"); // console will show they are equal.!
        } if (a != b) {
            System.out.println("They are NOT equal in java's eyes.!");
        }


            }
        }

