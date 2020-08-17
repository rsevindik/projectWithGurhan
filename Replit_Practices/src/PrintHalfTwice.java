import java.util.Scanner;

public class PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int wordHalfLength = (word.length())/2;
        word = word.substring(0,wordHalfLength);
        word = word+word;
        System.out.println(word);
    }
}
