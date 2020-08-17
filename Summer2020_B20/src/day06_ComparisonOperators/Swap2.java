package day06_ComparisonOperators;
/*  create a class called Swap, and write a program that can swap two variables' values
without using temporary variable
*/
public class Swap2 {

    public static void main(String[] args) {

        int a =10;
        int b= 15;

        a = a + b; // a = 25 and b = 15
        b = a - b; // b = 10 and a = 25
        a = a - b; // a = 15 and b = 10

        System.out.println(b);
        System.out.println(a);


    }
}
