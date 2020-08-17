package Day15_String;

import java.util.Scanner;

public class String_Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
        System.out.println("Please enter your first name: ");
        String firstName = input.next();
        char ch1 = firstName.charAt(0);

        System.out.println("Please enter your first name: ");
        String lastName = input.next();
        char ch2 = lastName.charAt(0);

        System.out.println("Your initial is: " +ch1+". "+ch2+".");

        System.out.println("Please enter your sentence here: ");
        String sentence = input.nextLine();


        char chFirst = sentence.charAt(0);
        int indexOfLast = sentence.length()-1;
        char chLast = sentence.charAt(indexOfLast);

        System.out.println("first character is: "+chFirst+ ", and the last character is: "+chLast);
*/
        // concat(str):
        String schoolName = "Cybertek";
       schoolName =  schoolName.concat(" School");  // "Cybertek School" (you need to assign =)

        System.out.println(schoolName);

        String r1 = "Cybertek" + 123+'A'+true;
        System.out.println(r1);

        String r2 = "Cybertek".concat("123");




    }
}
