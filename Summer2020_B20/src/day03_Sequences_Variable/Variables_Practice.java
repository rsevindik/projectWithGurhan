package day03_Sequences_Variable;

public class Variables_Practice {

    public static void main(String[] args) {
/*
        byte n1 = 100;
        short n2 = 200;

        System.out.println(n1+n2);
 */
        int num1 = 300;
        int num2 = 200;
        long sum = num1 + num2;

        System.out.println(sum);

        float num3 = 3.5f;
        double a = num3;   // Since double is larger than the float
      //  long b = num3; not possible since double value of num3 is larger than float.!

        long x = 100;
        float y = x; //long is smaller than float but edn result will be decimal.!!
        double z = x;

        System.out.println(x); // end result is whole number (int/long)
        System.out.println(y); // end result is decimal number (float same as double)
        System.out.println(z);

        // int p = 3.5; not possible

        float f1 = 100;
        float f2 = 100.0f;

        System.out.println(f1);
        System.out.println(f2);


    }
}
