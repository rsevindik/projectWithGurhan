import java.util.Scanner;

public class UserSquares {
    public static void main(String[] args) {
        int number;
        int maxValue;

        System.out.println("I will display a table " + "of numbers and their squares.");
        Scanner input = new Scanner(System.in);

        System.out.println("How high should I go?");
        maxValue = input.nextInt();

        System.out.println("Number \t Number Squared");
        System.out.println("========================");

        for (int i = 1; i <= maxValue; i++) {
            System.out.println(i + "\t\t\t\t" + i * i);
        }
        input.close();
    }
}
