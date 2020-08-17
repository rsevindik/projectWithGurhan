package SelfPractices_Summer_B20;

public class TypeCasting {
    public static void main(String[] args) {

        int i = (int) 3.9;      // by typing cast, you take a value of one type and convert it to another type (double --integer)
        System.out.println(i);  // it is possible to convert String as well.

        /* IMPLICIT CASTING (RULE: byte>short>int>long>float>double; meaning that
           small scale can always be casted in a large scale of primitive data) */
        double d1 = 200;
        long l = i;  // i is an integer anymore but since it's smaller than long we can fit it into long!
        System.out.println(d1);

        // EXPLICIT CASTING
        byte b1 = 5;
        short sh1 = 400;
        b1 = (byte)sh1;       // since short is larger than byte value we need to cast (convert: cover it with byte) short in byte

        double price = 200.55;
        int iPrice = (int)price;  // double value of price will be casted by (int)
        System.out.println(iPrice);

        int int1 = (int) (5/2.0);  // you can either assign double instead of (int) or convert/cast double variable into int!!
        System.out.println(int1);

        /* String str = "10";     either ways still won't be possible because int-number, string is character cannot be casted!!
           int n1 = str;   or int n1 = (int) str;  */





    }
}
