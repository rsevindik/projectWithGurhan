package day04_Variables;

public class Variables_Practice2 {

    public static void main(String[] args) {

        int iNum = 50;
        long lNum = iNum;

        // int iNum2 = lNum; not possible due to rage capacity of int smaller than long
        float fNum = lNum; // will print 50.0

        /* flat fNum = 500;
        float 123fNum = 500; cannot start with number special char
         */
        float fNum123 = 500;
        float num$ = 1000;

        // 1,000,000 is not okay but do it that way;
        int num1 = 1_000_000;
        System.out.println(num1);

        int num2;
        num2 = 1000;
        num2 = 2000;   // most updated and the current value will be executed
        System.out.println(num2);

        char a2 = '@';
        char a3 = 64;

        System.out.println(a2);
        System.out.println(a3);

        System.out.println('@' + 2); // @(=64) +2 = 66 =





    }
}
