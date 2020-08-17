import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {

        int testScore;
        String input;

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Enter your test score and then get your final grade:");
        testScore = keyboard.nextInt();

        if (testScore < 0)
            System.out.println("Invalid Score!");
        else if (testScore < 60)
            System.out.println("your grade is F.");
        else if (testScore < 70)
            System.out.println("your grade is D.");
        else if (testScore < 80)
            System.out.println("your grade is C.");
        else if (testScore < 90)
            System.out.println("your grade is B.");
        else if (testScore <= 100)
            System.out.println("your grade is A.");
        else
        System.out.println("Invalid entry");

    }
}
