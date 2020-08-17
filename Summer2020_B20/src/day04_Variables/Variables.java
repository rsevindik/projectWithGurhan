package day04_Variables;

import org.w3c.dom.ls.LSOutput;

public class Variables {

    public static void main(String[] args) {

        boolean result1 = true;
        boolean result2 = false;

        System.out.println(result1);
        System.out.println(result2);

        boolean result3 = 10 > 6000;

        System.out.println(result3);

        int a = 300;
        int b = 45;

        boolean result4 = b < a;     // also without creating this line just put b<a instead result4
        System.out.println(result4);

        int num1 = 200;
        int num2 = 300;

        boolean result5 = num1 < num2;

        boolean r1 = num1 > num2;

        int r2 = 10-3;   // this is no tru/false expression.!

        boolean r3 = true;
        boolean r4 = false;

        System.out.println(result5);
        System.out.println(num1 > num2);
        System.out.println(r1);



    }
}
