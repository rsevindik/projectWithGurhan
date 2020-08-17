import java.util.Scanner;

public class String_NoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        System.out.println(txt.substring(0, txt.length() - 1));
    }
}
