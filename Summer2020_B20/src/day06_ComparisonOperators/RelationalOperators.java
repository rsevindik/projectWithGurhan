package day06_ComparisonOperators;

public class RelationalOperators {

    public static void main(String[] args) {

        boolean b1 = 10 > 9;
        boolean b2 = 100 > 9000;
        boolean b3 = 87 >= 87;
        boolean b4 = 900 == 200;
        boolean b5 = true != false;
        boolean b6 = "Muhtar" == "Ramazan";
      //  boolean b7 = "123" == 123; //
        boolean b8 = "Muhtar" != "Bad Guy";
        boolean result1 = 'A' == 65;
        boolean b9 = 100 == 100.0;
        boolean b10 = 10 == 10.99;
        boolean b11 = 10 == (int) 10.99;

        int num1 = 100;
        int num2 = 101;
        boolean evenNumber = num1%2 == 0;
        boolean oddNumber = num2%2 != 0;
        



        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b8);
        System.out.println(result1);
        System.out.println(b9);
        System.out.println(b10);
        System.out.println(b11);
        System.out.println(evenNumber);
        System.out.println(oddNumber);


    }
}
