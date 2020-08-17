import java.util.Scanner;
public class CheckTemperature {
    public static void main(String[] args) {

        final double MAX_TEMP = 102.5;

        double temperature;

        Scanner keyb = new Scanner(System.in);

        System.out.println("enter the substance's Celcius temp: ");
        temperature = keyb.nextDouble();

        while (temperature > MAX_TEMP) {

            System.out.println("Tem. is too high. Turn the" +
                    "termostat down and wait 5 munites.");
            switch ("Then, take the Celsius temp. again.") {
            };
temperature = keyb.nextDouble();

        }
        System.out.println("The temperature is acceptable.");
        System.out.println("Check it again 15 minutes.");



    }
}
