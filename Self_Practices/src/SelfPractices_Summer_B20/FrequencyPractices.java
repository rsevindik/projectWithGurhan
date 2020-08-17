package SelfPractices_Summer_B20;
/*
input: RAmazan ==> output: RAmazn / R1A1m1a2z1n1
nonDuplicates-----
frequency of each char-----
 */
import java.util.Scanner;

public class FrequencyPractices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your text/word");
        String txt = input.next();

        String nonDuplicates = "";

        for (int i = 0; i <= txt.length()-1 ; i++) {
            String s = ""+txt.charAt(i); // needs to be String in order to be able to compare with nonDuplicates string
            if(!nonDuplicates.contains(s)){   // if does not contain then add it.!
                nonDuplicates +=s;

            }

        }
        System.out.println("Unique Chars in your text: "+nonDuplicates);

        String result ="";    // frequency.!!

        for (int j = 0; j <=nonDuplicates.length()-1 ; j++){ //nesting for loop in this one and starts with nonDuplicates
            char ch = nonDuplicates.charAt(j);   // r a m z n
            int count = 0;

            for (int i = 0; i <= txt.length()-1 ; i++) {
                char each = txt.charAt(i);       // r a m a z a n
                if(each == ch){
                    count +=1;
                }
            }
            result +=""+ch+count;
        }
        System.out.println("Frequency of each char in your text: "+result);

    }
}
