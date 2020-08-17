package Day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {

        Integer num = 100;
        int a = 100;

        byte t = 100;
        int z = t;

        //Integer z2 = t; compile error: byte ---Integer(dedicated to integers)

        Byte b1 =50;
        int  n1 = b1;

        byte b2 =40;
        //  Integer n2 =b2;

        Integer n3 = new Integer (123);

        Integer[] arr = new Integer[3];

        System.out.println( Arrays.toString(arr) );

        int p1 = 300;
        Integer p2 = p1; // Autoboxing(converting wrapper into primitive)

        Integer q1 = 500;
        int q2 = q1;   // unboxing (converting primitive into wrapper class)


        // Double r1 = 300; // wrapper class is only dedicated to its primitive
        Double r1 = 300.0;
        double r2 = r1;  // unboxing

        long l1 = 400;
        Long l2 = l1; // autoboxing


        Float f1 = 100.5f;
        Float f2 = f1;   //no boxing.! (wrapper to wrapper)

    }
}
