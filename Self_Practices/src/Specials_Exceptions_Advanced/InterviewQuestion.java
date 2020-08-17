package Specials_Exceptions_Advanced;

import java.util.ArrayList;

/*
Find first non-duplicate letter -> str = "testoftest"  ==> should return 'o' letter
 */
public class InterviewQuestion {

    public static void main(String[] args) {


        ArrayList<String> animals = new ArrayList<>();

        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayList: " + animals);  // output: ArrayList: [Dog, Cat, Horse]

        System.out.println("==============================");
    }

    public static String unique(String str) {
        String[ ] arr=str.split("");
        String unique1="";
        for(int j=0; j<arr.length; j++) {
            int num=0;
            for(int i=0; i<arr.length; i++ ) {
                if(arr[i].equals(arr[j]) )
                    num++;
            }
            if(num==1)
                unique1+=arr[j];
        }
        return unique1.charAt(0)+""; // ilk karakteri return derse


    }
}
