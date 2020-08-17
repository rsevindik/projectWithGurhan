package Day13_Scanner;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your company's name: ");
        String companyName = input.next();

        System.out.println("Your company's name is: "+companyName);

    }
}
