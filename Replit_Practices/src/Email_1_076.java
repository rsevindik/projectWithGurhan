import java.util.Arrays;
import java.util.Scanner;

public class Email_1_076 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int chMail = email.indexOf("@");
        String beforeAt = email.substring(0, chMail);
        String domainId = email.substring(chMail);

        if(beforeAt.contains("_")){
            String [] fist_Last = beforeAt.split("_");
            System.out.println(fist_Last[1]+"_"+fist_Last[0]+domainId);
        }else{
            System.out.println(email);
        }




    }
}
