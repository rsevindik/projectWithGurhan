import java.util.Scanner;

public class CheckPoint3_5_Division{
    public static void main(String[] args) {

     /*   int x=120, y, z;

        if(x > 100){
            y = 20;
            z=40;
        }
        */

     double number1, number2, quotient;

     Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number1 = keyboard.nextDouble();

        System.out.println("Enter another number: ");
        number2 = keyboard.nextDouble();

        if(number2 == 0){
            System.out.println("Division by 'zero' is not possible.");
            System.out.println("Please run the program again and enter other number different than 'Zero'");
        }else{
            quotient = number1 / number2;
            System.out.println("The quotient of " +number1+ " divided by " +number2+ " is " +quotient);
        }

    }
}
