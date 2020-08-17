import java.util.Scanner;

public class ProgrammingChallenges {
    public static void main(String[] args) {

        int servingsInBag = 10;
        int servingCal = 300;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many cookies did you eat, Today?");
        int numberOfCookiesEaten = keyboard.nextInt();

        int calOfEachCookie = servingCal/servingsInBag;
        int totalCalTaken = calOfEachCookie * numberOfCookiesEaten;

        System.out.println("You consumed " +totalCalTaken+ " calories, Today.");

    }
}
