package Day14_Recap;

import java.util.Scanner;

public class NextLine_Vs_Rest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your first name: ");
        String name = input.next();

        String fullName = input.nextLine();

        System.out.println(name);
        System.out.println(fullName);
    }
}
