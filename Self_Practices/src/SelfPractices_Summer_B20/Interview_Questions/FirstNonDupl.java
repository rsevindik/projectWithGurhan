package Specials_Exceptions_Advanced.Interview_Questions;

import java.util.ArrayList;

/*
Find first non-duplicate letter -> str = "testoftest"  ==> should return 'o' letter
 */
public class FirstNonDupl {

    public static void main(String[] args) {

unique("Ramazan Sevindik");

    } // main method ends here

    public static String unique(String str) {
        String[ ] arr=str.split("");
        String uniqueChars="";
        for(int j=0; j<arr.length; j++) {
            int num=0;
            for(int i=0; i<arr.length; i++ ) {
                if(arr[i].equals(arr[j]) )
                    num++;
            }
            if(num==1)
                uniqueChars+=arr[j];
        }
        return uniqueChars.charAt(0)+""; // ilk karakteri return ders
    }
}// class body ends here
