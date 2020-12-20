package SelfPractices_Summer_B20.Interview_Questions.ready_for_sublime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

/*
Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC

 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String removedStr = removeDuplicates1("Betul Zehra");
        System.out.println(removedStr);
        String removedStr2 = removeDuplicates2("Ramazan Sevindik");
        System.out.println(removedStr2);
        String removedStr3 = removeDuplicates3("Ahmet Tahsin");
        System.out.println(removedStr3);
    }

    public static String removeDuplicates1(String str) {

        String nonDuplicates = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDuplicates.contains(str.charAt(i) + "")) {
                nonDuplicates += str.charAt(i);
            }
        }
        return nonDuplicates;
    }

    public static String removeDuplicates2(String str1) {
        String nonDuplicates = "";

        String[] strArray = str1.split("");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strArray));

        for (int i = 0; i < str1.length(); i++) {
            int freqLetter = Collections.frequency(strList, str1.charAt(i) + "");   // "" necessary

            if (freqLetter == 1) {
                nonDuplicates += str1.charAt(i);
            }
        }
        return nonDuplicates;
    }

    public static String removeDuplicates3(String str2) {

        String nonDuplicate = "";
        ArrayList<String> str2List = new ArrayList<String>();

        str2List.addAll(Arrays.asList(str2.split("")));

        str2List.removeIf(p -> Collections.frequency(str2List, p) != 1); // [A, m, e, t,  , T, a, s, i, n]

        for (String each : str2List) {
            nonDuplicate += each;
        }
        return nonDuplicate;
    }
}