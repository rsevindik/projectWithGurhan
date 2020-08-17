public class Merge_String_178 {
    public static String mergeStrings(String one, String two) {
    /*
    String s1 ==> "12345"
    String s2 ==> "abcde"
    mergeStrings(s1,s2) ==> "1a2b3c4d5e"
    */
        String mergedStr = "", longerStr = "";

        int shorterWLength = 0;
        if (one.length() > two.length()) {
            longerStr = one;

            shorterWLength = two.length();
        } else {
            longerStr = two;
            shorterWLength = one.length();
        }
        for (int i = 0; i < shorterWLength; i++) {
            mergedStr += "" + one.charAt(i) + two.charAt(i);
        }
        mergedStr += longerStr.substring(shorterWLength);

        return mergedStr;
    }

    }
