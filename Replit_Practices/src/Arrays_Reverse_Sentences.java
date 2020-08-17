import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Reverse_Sentences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below
        String [] str = sentence.split(" ");//DO NOT FORGET TO LEAVE A SPACE (otherwise each char will be separated)
        String reversedStr = "";

        int i = str.length-1;
        while(i>=0){
            reversedStr+=str[i]+"\n";
            i--;
        }

        System.out.print(reversedStr);

    }
}
