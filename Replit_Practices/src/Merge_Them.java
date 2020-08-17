import java.util.Scanner;

public class Merge_Them {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        int lengthOfWord1 = word1.length();
        int lengthOfWord2 = word2.length();
        boolean isLength3 = lengthOfWord1 == 3 && lengthOfWord2 == 3;

        if(isLength3){
            System.out.println(" "+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2));
        }else{
            System.out.println("cannot merge");
        }

    }

}
