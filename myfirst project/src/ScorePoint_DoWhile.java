import java.util.Scanner;

public class ScorePoint_DoWhile {
    public static void main(String[] args) {

        int points;
        int totalPoints = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of point your team has earned for each game this season");
        System.out.println("Enter - 1 when finished!");
        System.out.println("========================");

        System.out.println("Enter game points or -1 to exit:");
        points = keyboard.nextInt();

        while (points != -1) {
            totalPoints += points;
            System.out.println("Enter the next game points or -1 to exit: ");
            points = keyboard.nextInt();

        }
        System.out.println("The total points that your team earned this season is: " + totalPoints);
    }
}
