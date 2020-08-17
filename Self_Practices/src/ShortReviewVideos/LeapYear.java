package ShortReviewVideos;

public class LeapYear {

    public static void main(String[] args) {

        short year = 2020;
        boolean leapYear = year % 4 == 0;  // divisible by 4 (year % 4 = 0)

        System.out.println(leapYear);

        int number = 65;

        boolean divisibleBy_2 = number % 2 == 0;
        boolean divisibleBy_3 = number % 3 == 0;
        boolean divisibleBy_5 = number % 5 == 0;

        System.out.println(divisibleBy_2);
        System.out.println(divisibleBy_3);
        System.out.println(divisibleBy_5);

    }
}
