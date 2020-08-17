package SelfPractices_Summer_B20;
import java.util.Arrays;
/*
1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3
        do not use same the approach we did in last office hour
    2. write a program that can count the frequency of a word from an array of string
            Ex:
                arr: {"Java", "C#", "Python", "Java"};
                word: "java"
                output:
                        2
            MUST USE for each loop
    3. write a program that can get the name and domain of any given email address
        Ex:
            cybertek@gmail.com
            output:
                name: cybertek
                domain: gmail
 */
public class WarmUp_7_18_2020 {
    public static void main(String[] args) {

        /* try descending ordering with for each (enhanced)
        int[] desc = new int[arr.length];      // { 3, 2, 1}

        //    desc[0] =  arr[2];
          //   desc[1] =  arr[1];
            // desc[2] =  arr[0];

           int k =arr.length-1;
        for(int i =0; i <= desc.length-1; i++ ){ //i: 0, 1, 2
            desc[i] =  arr[k];
            k--; // k: 2, 1, 0
        }
        System.out.println(Arrays.toString(desc));
        */

        String str = "JavajavaJAVA".toLowerCase();
        String word = "java";


        int countJava=0;
        while(str.contains("java")){

            str.replaceFirst("java", "");
            countJava++;
        }
        System.out.println(countJava);
        }

    }
