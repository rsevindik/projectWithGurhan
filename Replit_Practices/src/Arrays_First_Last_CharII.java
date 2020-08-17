import java.util.Arrays;
import java.util.Scanner;

public class Arrays_First_Last_CharII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        //TODO: Write your code below

        for (int i = 0; i <5 ; i++) {
            String [] firs_Last = {words[i].substring(0,1)+words[i].substring( words[i].length()-1,words[i].length())};
            System.out.println((firs_Last[i]));



        }

    }
}
