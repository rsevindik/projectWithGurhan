import java.util.Scanner;

public class Arrays_Split_Sentence {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    String [] words = sentence.split(" "); //DO NOT FORGET TO LEAVE A SPACE (otherwise each char will be separated)
    //String wordsToEachLine = "";  // when you leave a space will create unnecessary tab in the first word.!!
    //type your code below

    for( String each : words){
        System.out.print(each+"\n");
        }
    }

}




