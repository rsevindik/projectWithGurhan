package Day14_Recap;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Scanner_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
/*
        task:
        1. gender (next() )
        2. age (nextInt())
        3. country name  ( nextLine() )
        4. zipcode  ( nextInt()  )
        5. full name (nextLine() )
        6. full company name ( nextLine() )

 */
        System.out.println("Enter your gender: ");
        String gender = scan.next(); //19

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your country name: ");
        String countryName = scan.nextLine();

        System.out.println("Enter your ZipCode: ");
        int zipCode = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

    }
}
