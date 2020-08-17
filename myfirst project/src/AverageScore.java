import java.util.Scanner;
public class AverageScore {
    public static void main(String[] args) {

        double score1, score2, score3, average;
        String input;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter score #1:");
        score1 = keyboard.nextDouble();

        System.out.println("Enter score #2: ");
        score2 = keyboard.nextDouble();

        System.out.println("Enter score #3: ");
        score3 = keyboard.nextDouble();

        average = (score1 + score2 + score3) / 3;

        if(average >= 70){
            System.out.println("Your average is " + average+ ". That is a passing score.!");
        } else {
            System.out.println("Your average is " + average+ ". This is not a passing score. Please try again!");
        }



    }
}
