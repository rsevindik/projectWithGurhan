import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int wordLength = word.length();

        if (wordLength % 2 != 0){
            if (wordLength > 2){
                System.out.println(word.charAt(wordLength / 2));
            }else{
                System.out.println("" +word.charAt(0) + word.charAt(0) + word.charAt(0));
            }
        }
        if(wordLength % 2 == 0){
            if (wordLength >3){
                System.out.println(""+word.charAt(wordLength / 2-1) + word.charAt(wordLength / 2));
            }else{
                System.out.println(""+word.charAt(0) + word.charAt(1) + word.charAt(0) + word.charAt(1));
            }
        }

    }
}





