package SelfPractices_Summer_B20;

public class relationalOperatorPractice {
    public static void main(String[] args) {

        int x = 1000;

        boolean isItEven = x % 2 == 0;
        boolean isItOdd = x % 2 != 0;
        boolean divisible_3 = x % 3 == 0;
        boolean divisible_5 = x % 5 == 0;
        boolean divisible_10 = x % 10 == 0;

        System.out.println(isItEven); // true
        System.out.println(isItOdd);  // false
        System.out.println(divisible_3); // false
        System.out.println(divisible_5); // true
        System.out.println(divisible_10); // true

    }
}
