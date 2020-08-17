import java.util.Scanner;
public class CP_4_5 {
    public static void main(String[] args) {
        String userinput;
        char input;
        
        Scanner key = new Scanner(System.in);
        
        System.out.println("Enter [y] or [N] or [n]");
        userinput = key.nextLine();
        input = userinput.charAt(0);
        
        while (input != 'y' || input != 'N' ){
            
            System.out.println("You entered ann undesired input!");
            System.out.println("Enter [Y] or [y] or [N] or [n]:");
            userinput = key.nextLine();
            input = userinput.charAt(0);
        }
        System.out.println("Thanks for Listening my request!");
        
    }
}
