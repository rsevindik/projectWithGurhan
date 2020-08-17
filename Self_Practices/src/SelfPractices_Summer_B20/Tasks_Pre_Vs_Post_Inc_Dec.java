package SelfPractices_Summer_B20;

public class Tasks_Pre_Vs_Post_Inc_Dec {

    public static void main(String[] args) {

        /*

        int z =198;
        boolean even = z%2 == 0;
        System.out.println(even);

        byte a = 30;
        int b = a += a ;
        System.out.println(b);

        int X =10, Y =20, A = 30, B = 10, X2 = 2, Y2 = 3, A2 = 10, B2 = 2, X3= 20, Y3 = 3;

        X += Y;                  // X = 10 +20 = 30
        System.out.println(X);
        A -= B;                 // A = 30 – 10 = 20
        System.out.println(A);
        X2 *= Y2;                // X2 = 2 * 3 = 6
        System.out.println(X2);
        A2 /= B2;                // A2 = 10/2 = 5
        System.out.println(A2);
        X3 %=Y3;                // X3 = 2
        System.out.println(X3);

         */
        int x = 2;
        int y = x++;   // y is x + 1 but this expression has not been executed/compiled for y yet.
                      // It's just stored in the memory. therefore y = 2 .!
        System.out.println(y);
        System.out.println(x); // x's current value is going to be 3 .!





    }
}
