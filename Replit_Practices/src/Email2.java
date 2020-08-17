import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName = email.toUpperCase().substring(0,email.indexOf("_"));
        String lastName = email.toUpperCase().substring(email.indexOf("_")+1,email.indexOf("@"));
        String firstRest = firstName.toLowerCase().substring(1);
        String lastRest = lastName.toLowerCase().substring(1);

        System.out.println("First name: " +firstName.substring(0,1)+firstRest);
        System.out.println("Last name: " +lastName.substring(0,1)+lastRest);
        System.out.println("Domain: " +email.substring(email.indexOf("@")+1,email.indexOf(".")));
        System.out.println("Top-Level Domain: " +email.substring(email.indexOf(".")+1));

            }
}
