package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_Digits_Letters {
    public static void main(String[] args) {
        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('a','b','c','3','4','5','6','&','%','@','#','*'));

        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll( list2);
        digits.removeIf( p -> !Character.isDigit(p));// if character is no digit remove
        System.out.println("digits: "+digits);

        List<Character> letters = new ArrayList<>();
        letters.addAll(list2);
        letters.removeIf( p-> !Character.isLetter(p)); // if character is letter remove it form the list
        System.out.println("letters :"+ letters);

        ArrayList<Character> specialChar = new ArrayList<>();
        specialChar.addAll(list2);
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);

        System.out.println("Special Characters: "+specialChar);


    }

}
