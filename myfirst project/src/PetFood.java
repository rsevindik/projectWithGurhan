import java.util.Scanner;
public class PetFood {
    public static void main(String[] args) {

        String input;
        char foodGrade;

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Our pet food is available in three grades; A, B, and C. " +
                "\n\tWhich do you want pricing for? ");

        input = keyboard.nextLine();
        foodGrade = input.charAt (0);

        // "ABCDEFG"
        // 0123456....

        switch (foodGrade) {

            case 'a':
            case 'A':
                System.out.println("30 cents per lb.");

            case 'b':
            case 'B':
                System.out.println("20 cents per lb.");
                break;
            case 'c':
            case 'C':
                System.out.println("15 cents per lb.");
                break;
            default:
                System.out.println("Invalid Choice!");



        }
    }
}
