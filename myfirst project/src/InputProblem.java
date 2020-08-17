import java.util.Scanner;
public class InputProblem {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;
        double income;

        System.out.println("What is your age?");
        age = keyboard.nextInt();

        System.out.println("Please enter your annual income without using any special character?");
        income = keyboard.nextDouble();

        keyboard.nextLine(); /** consume the remaining newline: cleans up the remaining \n created from
                             the previous entry (by hitting the Enter key */

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("Hello, "+name+ "! Your age is " +age+ " and your income is $ "+income+ " Are these correct?");





    }
}
