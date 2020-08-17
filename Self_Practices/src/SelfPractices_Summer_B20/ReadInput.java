package SelfPractices_Summer_B20;

import java.util.Scanner;       // using import statement to access classes under different packages
public class ReadInput {     // Scanner is in the package java.util (import java.util.Scanner;)
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // import packageName.className;

        System.out.println("Please enter your name");
        String firstName = input.next();  // you will execute a name so, you use String/input.next();
        System.out.println("Nice to meet you, " + firstName);

        System.out.println("How old are you?");
        int age = input.nextInt();       // you will execute a number so, you use Int such as input.nextInt();
        // you can also use "input.nextLn();"
        System.out.println(age + " ...You look younger than your age");





    }
}
