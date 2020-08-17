package SelfPractices_Summer_B20;

public class Post_Vs_Pre {

    public static void main(String[] args) {

    int a = 10;
        System.out.println(++a ); //11
        System.out.println(a); // 11

        System.out.println("=================================");

    int b = 10;
        System.out.println(b++); //10 (current value)
        System.out.println(b); //11    (end result)

        System.out.println("==========================");
    int c = 25;
    int d = c++;  // d = 25 (current v.) but c = 26 after operation (end result)

        System.out.println(c);
        System.out.println(d);

        System.out.println("============================");
    int e = 25;
    e++;  // e = 25 current
        System.out.println(e);  // e = 26 (end result / once we execute)

        System.out.println("============================");
    int x = 8;
    int y = x--; //  y = 8 (current/pre decrement.!)
        System.out.println(y);  // y = 8 (which is the current value of x before the decrement.!
        System.out.println(x); //  x= 7  (end result/ after the post decrement.!)

        System.out.println("============================");
    int A = 1;// A=-1
        A =-A-- + A++ / -A-- * --A;
    //  A =  -1    +  0  /   -1  *  -1
    //  A =  -1   +    0   *   -1
    //  A = -1 +  0  = -1

        System.out.println(A);


        System.out.println("============================");
    int B = 50; //B = 50
    B =--B +B+++B--+B++;
    // B =  49  + 49  + 50  +  49
    // B =  197

        System.out.println(B);

    }
}
