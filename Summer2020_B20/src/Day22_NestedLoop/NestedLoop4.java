package Day22_NestedLoop;

public class NestedLoop4 {
    public static void main(String[] args) {


 /*      *
         **
         ***
         ****
         *****
         ******
         *******

         *******
         ******
         *****
         ****
         ***
         **
         *

         */

        for (int i = 1; i <=7 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("=======================");
        for (int k = 7; k >= 1 ; k--) {
            for (int m = k; m >= 1; m--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
