import java.util.Scanner;

public class WhileLoop2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your input: Yes or No");

        String userText = input.nextLine();

        while(!userText.equals("Yes") && !userText.equals("No")){
            System.out.println("Wrong Input. Try again.!");
            System.out.println("Please enter your input: Yes or No");
            userText = input.next();
        }
        System.out.println("Perfect! Thanks for entering "+userText);

    }
}
