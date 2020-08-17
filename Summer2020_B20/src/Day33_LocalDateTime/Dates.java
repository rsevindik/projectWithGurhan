package Day33_LocalDateTime;

import java.time.LocalDate;  // add this class.!
import java.util.Scanner;

public class Dates {

    public static void main(String[] args) {

        LocalDate DOB = LocalDate.of(2020, 07, 24); // of ... method!!!!!

        // year - mont - days   (default pattern)

        System.out.println(DOB);

        LocalDate today = LocalDate.now();  // now method.!!!!!!

        System.out.println(today);

        LocalDate y = LocalDate.of(2020, 1,1);
        boolean result = y.isLeapYear();
        System.out.println(result);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();

        boolean result2 = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(result2);

        System.out.println("====================================");

        System.out.println("Enter birth year, birth Month, birth day");

        LocalDate d = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());

        System.out.println(d+" is a leap year? "+d.isLeapYear());


    }
}
