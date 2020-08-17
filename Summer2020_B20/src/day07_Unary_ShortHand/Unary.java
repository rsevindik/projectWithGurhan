package day07_Unary_ShortHand;

public class Unary {

    public static void main(String[] args) {

        System.out.println(-1 + -10);  // -11

        int a = 20;
        --a;            // pre-decrement ..... --a; or a -= 1; will give you the same result ===> a = a - 1 ;
        System.out.println(a);

        int b = 10;
        ++b;            // pre-increment ..... ++a; or a += 1; will give you the same result ===> a = a + 1 ;
        System.out.println(b);

    }
}
