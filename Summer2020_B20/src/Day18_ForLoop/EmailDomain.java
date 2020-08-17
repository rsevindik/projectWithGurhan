package Day18_ForLoop;
import java.util.Scanner;
public class EmailDomain {
    public static void main(String[] args) {

                Scanner scan= new Scanner(System.in);

                String email = scan.next();

                //              012345678
                int index1 = email.indexOf("@");
                int index2 = email.lastIndexOf(".");


                String domain = email.substring(index1+1, index2 );  //"gmail"

                String newDomain = domain.replace(domain, "@yahoo");

                System.out.println(email.substring(0,index1)+newDomain+".com");

            }

        }
