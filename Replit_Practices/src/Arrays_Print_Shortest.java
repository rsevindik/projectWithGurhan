import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Print_Shortest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String [] words = str.split(", "); //space is a character (Do not forget to include a space after ",")
        Arrays.sort(words);

        String minLength = words[0];

        for(String each : words){
            if(each.length() < minLength.length()){
                minLength = each;

            }
        }
        String shortWords = "";
        for(String each :words){
            if(each.length() == minLength.length()){
                shortWords += each+" ";

            }
        }
        String [] shortWordsArr = shortWords.split(",");
        System.out.println(Arrays.toString(shortWordsArr));
    }
}

