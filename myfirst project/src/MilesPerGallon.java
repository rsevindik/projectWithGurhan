import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many miles did you drive?");
        double milesDriven = keyboard.nextDouble();

        System.out.println("How many gallons of gas did you consume?");
        double gasConsumed = keyboard.nextDouble();

        double mpg = milesDriven / gasConsumed;

        System.out.println("Your car's MPG(miles-Per-Gallon) is "+mpg);



    }
}
