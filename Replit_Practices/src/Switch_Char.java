import java.util.Scanner;

public class Switch_Char {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);
        //WRITE YOUR CODE HERE
        String prompt = " ";
        switch(response){
            case 'y':
                prompt = "Your request is being processed";
                break;
            case 'n':
                prompt="Thank you anyway for your consideration";
                break;
            case 'h':
               prompt="Sorry, no help is currently available";
                break;
            default:
                prompt="Invalid entry, please try again!";
                break;

        }
        System.out.println(prompt);
    }
}
