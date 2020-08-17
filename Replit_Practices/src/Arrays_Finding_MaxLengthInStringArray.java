import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Finding_MaxLengthInStringArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();

        }

        //write your code below
        String longestWord = words [0];
        for( String each : words){
            if(longestWord.length()< each.length()){
                longestWord= each;

            }
        }
        System.out.println(longestWord);
    }
        }



