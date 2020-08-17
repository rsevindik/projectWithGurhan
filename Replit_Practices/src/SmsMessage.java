import java.util.Scanner;

public class SmsMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        System.out.println("sender: "+ message.substring(message.indexOf("<")+1,message.indexOf(">")));
        System.out.println("Phone Number: "+ message.substring(message.indexOf("[")+1,message.indexOf("]")));
        System.out.println("sender: "+ message.substring(message.indexOf("{")+1,message.indexOf("}")));
    }
}
