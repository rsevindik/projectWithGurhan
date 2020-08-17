package day07_Unary_ShortHand;

public class LeapYear {

    public static void main(String[] args) {

        short year = 2020;
        boolean leapYear = year % 4 == 0;  // divisible by 4 (year % 4 = 0)

        System.out.println(+year+ " is a Leap Year? " + leapYear);

    }
}


