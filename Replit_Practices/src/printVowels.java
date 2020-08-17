import java.util.Scanner;

public class printVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below


        String vowels = "";
        //char chVowel = ' ';
        //boolean isVowel = chVowel.equals('a' || 'e' || 'i' || 'u'|| 'o');



        for (int i = 0; i <= word.length()-1 ; i++) {
            char chVowel = word.charAt(i);
            if(chVowel == 'a' ||chVowel == 'e' || chVowel =='i' || chVowel =='u'|| chVowel =='o'){
                vowels +=chVowel;
            }
        }


        System.out.println(vowels);


    }
}
