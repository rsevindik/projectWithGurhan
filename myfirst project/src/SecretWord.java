import java.util.Scanner;

public class SecretWord {
    public static void main(String[] args) {

        String input;

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Enter the secret word:");
        input = keyboard.nextLine();

        if (input.equalsIgnoreCase("Rabbifirverhamveentehayrurrahimin.!"))
            System.out.println("Amin.!");
        else
            System.out.println("Hint: the one that your Uncle says all the time..");




    }
}
