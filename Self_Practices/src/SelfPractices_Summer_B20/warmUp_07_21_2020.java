package SelfPractices_Summer_B20;

import java.util.Arrays;

/*
1.  write a return method called frequency that accepts two parameters: string str and char ch, the method returns
the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
            please copy paste the method to the util class
2. use the above method to create another called uniques that accepts a string parameter and returns it's unique
characters as String
            Ex:
                uniques("ABBC");       ==> "AC"
                uniques("Cybertek");   ==> "cybrtk"
                please copy paste the method to the util class
3. use the methods removeDup and frequency in util class to create a thrid method called frequencyOfChars that
can find the frequency of all characters from a string
        Ex:
            frequencyOfChars("AAABBBBCCCC");  ===> A3B4C4
            frequencyOfChars("DDEFJJJ"); ===> D2E1F1J3
            please copy paste the method to the util class
 */
public class warmUp_07_21_2020 {
    public static void main(String[] args) {
        String [] str = {"AAAAA", "BBBBBDDDBGB" , "W'BVAAAEVAKFBFV" , "AKVBAKAKFFVADK","ADKFFVADKD"};
        char ch = 'A';
        int frequency = frequencyOfChar(str,ch);

        System.out.println(frequency);

    }







public static int frequencyOfChar(String []str, char ch){
String uniques = ""+ch;
    int count = 0;
    for(String each : str ){
        if(each.equals(ch)){
            count++;
        }
}
            return count;
        }

    }
