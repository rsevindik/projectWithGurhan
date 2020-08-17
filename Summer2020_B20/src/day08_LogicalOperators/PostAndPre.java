package day08_LogicalOperators;

public class PostAndPre {

    public static void main(String[] args) {

           /*
        double kg = 198;      // ratio between kg and pound is; 1 kg = 2.2 lbs
        double lb = kg * 2.2;

        System.out.println(lb);

        double lt = 5.6;
        double gal = lt * 0.27; // ratio between lt and gallon is; 1 lt = 0.27 gal

        System.out.println(gal);

        double gallon = 4.3;
        double litters = gallon * 1/3.785;

        System.out.println(litters);

       ==================================

        int a = 200;                      // value of a in the memory: 200
        int b = -a++ + -(--a) * a-- % 2; // -200 - (200) * 200 %2= -200 - 200 * 0= -200;
        System.out.println(b);

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
           // 300 + 400 - 300 * 400 + 300 / 400 =
           // 300 + 400 - (120000) + (300 / 400) =
           //    700    - 120000 + 0 =
           //         -119300

        */
            int a = 200; // 200   (current value that stored in memory)
            int b = -a++ + - --a * a-- % 2;
                  // -200 + (- 200) * 200 % 2;      // value of the variable being used in the expression
                                                    // (pre;changes immediately, post stored in the memory)
                  // -200 - 200 * 200 % 2 ;
                  // -200 - 40000 % 2 ;
                  // -200 - 0= -200;
            System.out.println(b);

            int x = 300;
            int y = 400;
            int z = x + y - x * y +x / y;

            System.out.println(z);

    }
}
