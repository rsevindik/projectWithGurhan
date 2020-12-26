package SelfPractices_Summer_B20.Interview_Questions.ready_for_sublime;

// Write a return method that check if a string is build out of the same letters of another string.
import java.util.Arrays;

public class Anagram_Same_Letter {  /** #3 */
    public static void Anagram(String str1, String str2){
        // you can also use custom method: boolean instead of void

        char []  ch1 = str1.toLowerCase().toCharArray();
        char []  ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
       // System.out.println(Arrays.toString(ch1));
        Arrays.sort(ch2);
       // System.out.println(Arrays.toString(ch2));

       /** System.out.println(Arrays.toString(ch1).equals(Arrays.toString(ch2)));
        * // this is the 2nd and the easiest way. */

        String str1Asc = "";
        String str2Asc = "";

        for ( char each   : ch1){
            str1Asc += each;
        }
        for ( char each   : ch2) {
            str2Asc += each;
        }

        System.out.println(str1Asc.equals(str2Asc)); // execute True (If you use boolean then add return, take out sout.!!
        }

        public static void main(String[] args) {
        Anagram("Ramazan", "RMZNaaa");
    }
}
