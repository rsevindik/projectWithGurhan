package day06_ComparisonOperators;

public class Swap1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int c = b; /** c = 15 this is called temporary variable and you do not declare 'c' as an variable but still use it for
                      swapping a to b.!! */

        b = a; // b = 10
        a = c; // a = 15

        System.out.println(a); // 15
        System.out.println(b); // 10
    }
}
