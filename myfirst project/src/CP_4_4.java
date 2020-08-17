import java.util.Scanner;
public class CP_4_4 {
    public static void main(String[] args) {

        int number;

        Scanner keyb = new Scanner(System.in);

        System.out.println("Enter a number:");
        number = keyb.nextInt();

        while(number < 10 || number > 24) {

            System.out.println("Incorrect Input. Enter a number again:");
            number = keyb.nextInt();
            System.out.println("Enter a number:");
        }

    }
}
