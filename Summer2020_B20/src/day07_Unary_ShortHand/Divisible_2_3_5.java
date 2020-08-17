package day07_Unary_ShortHand;

public class Divisible_2_3_5 {

    public static void main(String[] args) {

        int number = 102;

        boolean divisibleBy_2 = number % 2 == 0;
        boolean divisibleBy_3 = number % 3 == 0;
        boolean divisibleBy_5 = number % 5 == 0;

        System.out.println(divisibleBy_2);
        System.out.println(divisibleBy_3);
        System.out.println(divisibleBy_5);

        System.out.println( number+ " is evenly divisible by 2 ? : " + divisibleBy_2);
        System.out.println( number+ " is evenly divisible by 3 ? : " + divisibleBy_3);
        System.out.println( number+ " is evenly divisible by 5 ? : " + divisibleBy_5);



    }
}
