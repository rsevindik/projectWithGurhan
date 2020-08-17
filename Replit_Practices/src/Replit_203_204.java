import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Replit_203_204 {
    public static boolean isPalindrome(String check) {

        char chFrist = check.toLowerCase().charAt(0);
        char chLast = check.toLowerCase().charAt(check.length() - 1);

        boolean result = chFrist == chLast;


        return result;

    }

    public static void test(ArrayList<Double> dubs) {
        //write code here

        dubs.remove(0);
        dubs.remove(0);
    }
    //===================================================//

    public static boolean isAnagram(String word1, String word2) {

        ArrayList<Integer> numList1 = new ArrayList<>();
        ArrayList<Integer> numList2 = new ArrayList<>();
        String word3 = "";
        int count = 0;

        for (int i = 0; i < word2.length(); i++) {
            if (word2.charAt(i) != ' ') {
                word3 += word2.charAt(i);
            }
        }

        word2 = word3;

        for (int i = 0; i < word1.length(); i++) {
            count = 0;
            for (int j = 0; j < word1.length(); j++) {
                if (word1.charAt(i) == word1.charAt(j)) {
                    count++;
                }
            }
            numList1.add(count);
        }
        for (int i = 0; i < word1.length(); i++) {
            count = 0;
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    count++;
                }
            }
            numList2.add(count);
        }
        for (int each : numList1) {
            for (int flag : numList2) {
                if (each != flag) {
                    return false;
                }
            }
        }
        return true;
    }

    //=========================================//
    public static boolean isAnagrams(String word1, String word2) {


        char[] ch1 = word1.toLowerCase().toCharArray();
        char[] ch2 = word2.toLowerCase().toCharArray();

        Collections.sort(Arrays.asList(word1));
        Collections.sort(Arrays.asList(word2));
        word1.trim();
        word2.trim();


        boolean result = ch1.equals(ch2);


        return result;

    }

    //=========================================//

    public static int[] populate(int[] r) {
        for (int i = 1; i <= r.length; i++) {

        }

        return r;
    }
}

