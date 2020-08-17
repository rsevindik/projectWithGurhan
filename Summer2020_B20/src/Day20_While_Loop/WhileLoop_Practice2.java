package Day20_While_Loop;

import java.util.Scanner;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {
        int repetition = 1;
        while (repetition <= 10) {
            System.out.println("Ramazan");
            repetition++;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str = input.nextLine();
        String reversedStr = "";
        int i = str.length() - 1;

        while (i>=0) {

            reversedStr += str.charAt(i);
            i--;
        }
        System.out.println(reversedStr);
    }
}
