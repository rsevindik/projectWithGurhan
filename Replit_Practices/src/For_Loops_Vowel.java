import java.util.Scanner;

public class For_Loops_Vowel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine().toLowerCase();
        //write your code below

        String vowels = "";

        for (int i = 0; i <=word.length()-1 ; i++) {
            char ch = word.charAt(i);

            if(ch == 'a'  || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u'){
                vowels +=""+ch;
            }

        }
        System.out.println(vowels);





    }
}
