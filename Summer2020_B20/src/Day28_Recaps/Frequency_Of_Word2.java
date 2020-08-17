package Day28_Recaps;

import java.util.Scanner;

public class Frequency_Of_Word2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String word = input.nextLine();
        //String str = "catcatcatdogdogramazanRamazanRAMAZANramAZANramazan".toLowerCase();
        //(0,3)

        int l = word.length();

        int count = 0; //"cat"
        for (int i = 0; i <=str.length()-l ; i++) {
            if( str.substring(i,i+l).equalsIgnoreCase(word)) { //after adding 7(which is the length of the word=ramazan) to i
                                                            // you must substruct it from length to keep it in bound
                count++;

            }
        }
        System.out.println(count);
    }
}
