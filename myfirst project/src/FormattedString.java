public class FormattedString {
    public static void main(String[] args) {

       // double sales = 12345.67;

        /* %f is a format specifier. The letter f indicates that a floating-point value will be inserted into
        the string when it is displayed; System.out.printf("Our sales are %f for the day.\n", sales); ==> will execute:
        Our sales are 12345.670000 for the day.
         */

        //System.out.printf("Our sales are %f for the day. \n", sales);
        //System.out.println("Our sales are "+sales+" for the day.");

        double value1 = 3, value2 = 6.0, value3 = 9.0;
        System.out.printf("%f %f %f \n", value1, value2, value3);

        int hours = 40;
        System.out.printf("I worked %d hours this week. \n" , hours);

        double temp = 78.42819;
        System.out.printf("The temperature is %12.3f degrees. \n", temp); // .# between % and f represents how many
        // decimals you would like to include in your result while rounding the decimal numbers.!

        // Declare a variety of double variables.
        double num1 = 127.899;
        double num2 = 3465.148;
        double num3 = 3.776;
        double num4 = 264.821;
        double num5 = 88.081;
        double num6 = 1799.999;
        double num7 = 1234567.8901;

        // Display each variable in a field of 8 spaces with 2 decimal places.
        System.out.printf("%8.2f\n", num1);
        System.out.printf("%8.2f\n", num2);
        System.out.printf("%8.2f\n", num3);
        System.out.printf("%8.2f\n", num4);
        System.out.printf("%8.2f\n", num5);
        System.out.printf("%,8.2f\n", num6);
        System.out.printf("%,15.2f\n",num7);

        // Declare a variety of int variables.
        int numA = 123, numB = 12, numC = 45678, numD = 456, numE = 1234567, numF = 1234;

        // Display each variable left-justified
        // in a field of 8 spaces.

        System.out.printf("%-8d%-8d\n", numA, numB);
        System.out.printf("%-8d%-8d\n", numC, numD);
        System.out.printf("%-8d%-8d\n", numE, numF);

        /**

         This program demonstrates how to use the System.out.printf method to format a number as currency.

         */
        double monthlyPay = 5000.0;
        double annualPay = monthlyPay * 12;

        System.out.printf("Your annual pay is $%,.2f\n", annualPay);

    }
}
