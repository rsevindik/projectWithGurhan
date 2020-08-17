package day07_Unary_ShortHand;

public class positive_zero_negative {

    public static void main(String[] args) {

        int number = -11;
        boolean negativeNumber = number < 0;
        boolean positiveNumber = number > 0;
        boolean zero = number == 0;

        System.out.println("Your number is negative? : " + negativeNumber+ ", which means it's less than 'zero'.");
        System.out.println("Your number is positive? : " + positiveNumber+ ", which means it's greater than 'zero'.");
        System.out.println("Your number is zero? : " + zero);

    }

}
