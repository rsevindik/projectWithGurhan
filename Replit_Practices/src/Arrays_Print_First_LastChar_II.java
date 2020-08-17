import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Print_First_LastChar_II {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        //TODO: Write your code below
        String str = "";
        for (String each : words) {
            str += "" + each.charAt(0) + each.charAt(each.length() - 1) + " ";
        }
        //System.out.println(str);
        System.out.println(Arrays.toString(str.split(" ")));
    }
}