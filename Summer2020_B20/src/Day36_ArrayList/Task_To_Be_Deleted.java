package Day36_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Task:1. write a program that can find the unique characters from a stringDO NOT use nested loop"ABABCDEE"output: C D
2. write a program that can find the frequency of character from a StringDO NOT use nested loop"AABBCCDDEE"  ==>
"ABCDE"output: A2B2C2D2E2
 */
public class Task_To_Be_Deleted {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();

        String str = "ABABCDEE";
        String[] chars = str.split("");

        for (String each : chars) {
            letters.add(each);  // ArrayList
        }
        String uniques = "";
        for (String each : letters) {
            if (Collections.frequency(letters, each) == 1) {
                uniques += each + " ";
            }

        }
        System.out.println(uniques);

        System.out.println("===========================");

        String str2 = "AABBCCDDEE";
        char[] chars2 = str2.toCharArray();
        ArrayList<Character> charArrayList = new ArrayList<>(Arrays.asList());
        for (Character each : chars2) {
            charArrayList.add(each);
        }

        ArrayList<Character> nonRepeated = new ArrayList<>();
        for (Character each : chars2) {
            if (!nonRepeated.contains(each))
                nonRepeated.add(each);
        }

        for (Character each : nonRepeated) {
            int frequencies = Collections.frequency(charArrayList, each);
            System.out.print(""+ each + frequencies);
        }
    }
}








