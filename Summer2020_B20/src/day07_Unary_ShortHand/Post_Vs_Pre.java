package day07_Unary_ShortHand;

public class Post_Vs_Pre {

    public static void main(String[] args) {
/*
    int a = 20;
    a--;            // post-decrement ..... a--; or a -= 1; will give you the same result ===> a = a - 1 but after end result;
        System.out.println(a);

    int b = 10;
    b++;            // post-increment ..... a++; or a += 1; will give you the same result ===> a = a + 1 but after the end result;
        System.out.println(b);
 */

        System.out.println("++++++++++++++++++++++++");
        int c = 25;
        int d = c++; // c=26, d = 25 .!

        System.out.println(c);
        System.out.println(d);

        int x = 8;
        int y = x--;  // y = 8 because x-- post dec which is not going to change the value
        System.out.println(x);
        System.out.println(y);

        System.out.println("==================================");

        int B = 50;

        // B=   49 / 50  / 49  / 50               current value of it
           B = --B + B++ + B-- + B++;
        // B = 49  + 49  + 50  + 49               end result .!
        // B = sum (197)
        System.out.println(B);    // 197

        System.out.println("=========================");

           /**   A = 1
                statement | operation | value | A value|
                -A--      | -(1)--    | -1    | A = 0
                A++       |  (0)++    | 0     | A = 1
                -A--      | -(1)--    | -1    | A = 0
                --A       | --(0)     | -1    | A -1
        The values: -1 + 0  / -1 * -1
                -1 +    0    * -1
                -1 +        0
                -1
            */





    }
}
