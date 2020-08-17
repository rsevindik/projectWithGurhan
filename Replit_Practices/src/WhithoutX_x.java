import java.util.Scanner;

public class WhithoutX_x {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);
        boolean startsWithX = firstLetter == 'X' || firstLetter == 'x';
        boolean endsWithX = lastLetter == 'X' || lastLetter == 'x';

        if(startsWithX && endsWithX){
            word = word.substring(1,word.length()-1);  // last letter is excluded
        }
        else if(startsWithX && !endsWithX){
            word = word.substring(1);
        }
        else if(!startsWithX && endsWithX){
            word = word.substring(0,word.length()-1);
        }else{
            word = word;
        }
        System.out.println(word);
        scan.close();
    }
}
