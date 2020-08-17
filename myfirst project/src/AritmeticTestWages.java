public class AritmeticTestWages {
    public static void main(String[] args) {

        /*
        int number1 = 69;
        int div = 5;      // divider, divisor

        System.out.println(number1 % div);
        System.out.println(number1 / div);
         */

        double regularWages;
        double basePay = 25.00;
        double regularHours = 40;
        double overtimeWages;
        double overtimePay = 37.5;
        double overtimeHour = 10;
        double totalWages;

        regularWages = basePay * regularHours;
        overtimeWages = overtimePay * overtimeHour;

        totalWages = regularWages + overtimeWages;
        System.out.println("Wages for this week are $ " +totalWages);






    }
}
