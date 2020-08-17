import java.util.Scanner;

public class CaffeineOverDose {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int numberOfMilligrams = input.nextInt();
        int overDose = 10*1000 / numberOfMilligrams;

        System.out.println("It would take about " + overDose+ " drinks for a lethal overdose.");
    }
}
