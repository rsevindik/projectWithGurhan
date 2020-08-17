package day06_ComparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {

        short s1 = 100;
        long l1 = s1;  // implicitly casting (done automatically)
        long l2 = (long) s1;
        int i1 =300;
        double d1 = i1; //result will be decimal (300.0)
        double d2 = i1;

        System.out.println("================================");

        double D1 = 400.5555;
        int I1 = (int)D1; // 400 (casting double into integer)

        System.out.println(I1);

        long L1 = 4400;
        short S1 = (short)L1;  // long casted into short

        System.out.println(L1);

        int n1 = 1000;
        byte b1 = (byte) n1;

        System.out.println(b1);   // -24

        double m1 = 34.5;
        float f1 = (long) m1;  // int instead of long would also work in the same way.!

        System.out.println(f1);

        long r1 = -500;
        int p1 = (short) r1;  // not possible long  needs to be casted automatically into short or int.!

        System.out.println(p1);

        long r2 = 13;
        byte t1 = (byte) r2; // long value is casted into byte value

        System.out.println(t1);












    }
}
