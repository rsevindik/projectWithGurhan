package Day16_String;

import java.util.Scanner;

public class IgnoreCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Are you employed?");
        String employmentStatus = input.next();   // String answer = input.next().toLowerCase();

        if(employmentStatus.equalsIgnoreCase("yes")){ // look at the 2nd option above.!
            System.out.println("Employed");
        }else{
            System.out.println("Not employed");
        }
    }
}
