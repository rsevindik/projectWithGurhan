package day09_IfStatement;

public class Max_Median_Min {

    public static void main(String[] args) {

        double a = 5000, b = 2000, c = 1000;

        boolean aIsMax = a > b && a > c;
        //              500> 200 && 500 > 1000
        //               true && false ==> false
        boolean bIsMax = aIsMax == false && b > c;
        //   or use    = b > a && b > c;
        //              200>500 && 200 > 1000
        boolean cIsMax = !aIsMax && !bIsMax; // same as !(aIsMax && bIsMax);
        //        aIsMax == false && bIsMax == false;
        //        c > b && c > a;

        System.out.println("=========================");

        double max = 0;   //local variable needs to be initialized but can be changed later.!
                         // sout and {} are not necessary but MAX=.. is extremely important

            if (aIsMax) {
                max = a;        //Same as system.out.println(a);
            }
            if (bIsMax) {       // System.out.println(b);
                max = b;
            }
            if (cIsMax) {      //System.out.println(c);
                max = c;
            }
            System.out.println(max + " is the max number!");

        System.out.println("===========w/Ternary==============");

        double max2 = (aIsMax)? a: (bIsMax)? b:(cIsMax)? c: 0;
        System.out.println(max2+ " is the max number!");

        }
    }

