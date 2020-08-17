package day31_Recap;

import Library.Util;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AABBBCCCDDDDDDDDDDEEEEEEEEEEEEFFFFFFFF";

        String expectedResult = "";

        String nonDuplicates = Util.removeDup(str);

        for( char each : nonDuplicates.toCharArray()){  // do not use str here because you want t eliminate repeated chars
            int count = Util.frequency(str, each);
            expectedResult += ""+each+count;
            }

 /*
            for (int i = 0; i <= nonDuplicates.length()-1 ; i++) {

                char ch1 = nonDuplicates.charAt(i);
                int count1 = Util.frequency(str, ch1);
                expectedResult += ""+ch1+count1;
            }

        char ch1 = nonDuplicates.charAt(0);
        int count1 = Util.frequency(str, ch1);
        expectedResult += ""+ch1+count1;

        char ch2 = nonDuplicates.charAt(1);
        int count2 = Util.frequency(str, ch2);
        expectedResult += ""+ch1+count1;

        char ch3 = nonDuplicates.charAt(2);
        int count3 = Util.frequency(str, ch3);
        expectedResult += ""+ch3+count3;

         */

        System.out.println(expectedResult);

        System.out.println("==============================================");

        String str2 = "wwweeeeerrrrrrrrrttttttttyyyyyyyuuuuuu";

        String expectedResult2 = frequencyOfChars(str2);

        System.out.println(expectedResult2);

    } /**  end of the Main Method ************* you can start creating your return(Custom) method below.!! */

    public static String frequencyOfChars(String str){

        String expectedResult = "";
        String nonDup =    Util.removeDup(str);

        for(char each : nonDup.toCharArray() ){
            int count1 = Util.frequency(str, each);
            expectedResult +=   ""+ each + count1;
        }

        return expectedResult;

    }

}
