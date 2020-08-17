package Day27_Recap;
 /*
    sort():
    toString():
    equals():
     */

import java.util.Arrays;

public class Arrays_Utilities {
    public static void main(String[] args) {

        String [] names = {"Ramazan", "Ali", "Erdem","Zehra","Betul"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        int [] score = {80, 75, 65, 110, 90,45,56,78};

        Arrays.sort(score);
        System.out.println(Arrays.toString(score));

        System.out.println("Maximum: "+score[score.length-1]);
        System.out.println("Minimum: "+score[0]);

        System.out.println("==============================");

        String [] s1 = {"A","B","C"};
        String [] s2 = {"A","B","C"};

        System.out.println( Arrays.equals(s1,s2));

        String [] a1 = {"B","A","C","D"};
        String [] a2 = new String [2];
        a2 = a1;


       Arrays.sort(a1);
       Arrays.sort(a2);
       System.out.println( Arrays.equals(a1,a2));

       String w1 =  Arrays.toString(a1);
       System.out.println(w1);

    }
}
