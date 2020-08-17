package Day13_Scanner;

import java.util.Scanner;

public class Next_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.next();
        scan.next();   // if you are using more than one word then it will show up here.!
        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        String fullName = firstName +" "+lastName;

        System.out.println("Full name is: " +fullName);



    }
}
