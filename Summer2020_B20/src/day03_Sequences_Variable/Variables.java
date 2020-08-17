package day03_Sequences_Variable;

public class Variables {
    /*
    declare variable and assigning statement or all at once;
    DataType variableName = Data;
     */
    public static void main(String[] args) {
        // length: 4, width: 2 and area is L*W=20

        byte length = 4;
        byte width = 2;
        System.out.println(length * width);
     /* or
        int area = length * width;
        System.out.println(area);
      */

        byte num1 = 127;
        short number2 = 128;
        int number3 = 999999000; // if you add one more number - compile error
                                // then you should change int into long and put "l or L" end of the number
        int score = 100;
        System.out.println(score);

        // PI = 3.14 (22/7)
        double PI = 3.14;
        System.out.println(PI);

        float decimal1 = 3.5f; // you can put lower or upper case letter.!

        /*
            =====byte variable
            byte max_byte;
            byte min_byte;
            // MAX_VALUE and MIN_VALUE Byte class
            max_byte = Byte.MAX_VALUE;
            min_byte = Byte.MIN_VALUE;
            ====== short variable
            short max_short;
            short min_short;
            ========= MAX_VALUE and MIN_VALUE Short class
            max_short = Short.MAX_VALUE;
            min_short = Short.MIN_VALUE;
            ========= int variable
            int max_int;
            int min_int;
            ======== MAX_VALUE and MIN_VALUE Int class
            max_int = Integer.MAX_VALUE;
            min_int = Integer.MIN_VALUE;
            =========long variable
            long max_long;
            long min_long;
            ======== MAX_VALUE and MIN_VALUE Long class
            max_long = Long.MAX_VALUE;
            min_long = Long.MIN_VALUE;
            =======float variable
            float max_float;
            float min_float;
            ======= MAX_VALUE and MIN_VALUE Float class
            max_float = Float.MAX_VALUE;
            min_float = Float.MIN_VALUE;
            ========double variable
            double max_double;
            double min_double;
            ======== MAX_VALUE and MIN_VALUE Double class
            max_double = Double.MAX_VALUE;
            min_double = Double.MIN_VALUE;
            System.out.println("The byte maximum is = "+max_byte);
            System.out.println("The byte minimum is = "+min_byte);
            System.out.println("The short maximum is = "+max_short);
            System.out.println("The short minimum is = "+min_short);
            System.out.println("The int maximum is = "+max_int);
            System.out.println("The int minimum is = "+min_int);
            System.out.println("The long maximum is = "+max_long);
            System.out.println("The long minimum is = "+min_long);
            System.out.println("The float maximum is = "+max_float);
            System.out.println("The float minimum is = "+min_float);
            System.out.println("The double maximum is = "+max_double);
            System.out.println("The double minimum is = "+min_double);
         */



    }
}
