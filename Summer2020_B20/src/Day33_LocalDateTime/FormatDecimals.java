package Day33_LocalDateTime;

import java.text.DecimalFormat;

public class FormatDecimals {
    public static void main(String[] args) {

        DecimalFormat m = new DecimalFormat("0.000"); // determines how many dec you would like to see

        double a = 22/7.0;

        System.out.println(a);

        System.out.println(m.format(a));

        //6.678543212222222
        System.out.println(m.format(6));


    }


}
