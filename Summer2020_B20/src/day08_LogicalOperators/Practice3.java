package day08_LogicalOperators;

public class Practice3 {

    public static void main(String[] args) {

        int b = 2; // current value of b:
        boolean result = ++b == 2 || --b == 2 && --b == 2;
                      //  3  == 2  or   2 ==

        System.out.println(result);
        System.out.println(b);

        int c = 5;// c =
        boolean r2 = c++ == 6 || c-- == 5;
                  //  5 ==

        boolean A = true;
        boolean B = !A;
        System.out.println(r2);


                 //
        boolean C = A != B && A == !B && !A == B;
                 // T != F && T == T && F == F
                 //   T    &&   T    &&   T
                //         T         &&   T   =  T
        System.out.println(C);








    }
}
