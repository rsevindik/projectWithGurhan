package Day15_String;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        String firstName = input.next();
        int stringSize1 = firstName.length();

        System.out.println("Enter your Last Name: ");
        String lastName = input.next();
        int stringSize2 = lastName.length();

        //String fullName = fistName.concat(" ".concat(lastName));   //" ".concat(fullName)
        String fullName = (firstName+" "+lastName).toUpperCase();

        System.out.println("Your full name is: "+fullName); // .concat(fullName)

        System.out.println((stringSize1>stringSize2)? firstName+ " is the longest word":lastName+" is the longest word");

    }
}
