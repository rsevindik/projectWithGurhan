package Day15_String;

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        String fullName = (firstName +" "+ lastName).toUpperCase();
        System.out.println(fullName);
    }
}
