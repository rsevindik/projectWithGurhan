import java.util.Scanner;

public class Print_First_And_Last_Letters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char chFirst = word.charAt(0);
        char chLast = word.charAt(word.length()-1);

        System.out.println(""+chFirst+chLast);
    }

}
