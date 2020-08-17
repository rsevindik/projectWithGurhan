import java.util.Scanner;

public class PrintTheLongestWord {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE

        int lengthOfWord1 = word1.length();
        int lengthOfWord2 = word2.length();

        if(lengthOfWord1 > lengthOfWord2){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }
    }
}
