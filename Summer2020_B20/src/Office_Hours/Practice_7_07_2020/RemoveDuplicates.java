package Office_Hours.Practice_7_07_2020;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String result = "";

        for (int i = 0; i <= str.length()-1 ; i++) {

            String s = ""+ str.charAt(i);
/*
            if(result.contains(s)){
                continue;
            }else{
                result +=s;
            }

 */
            if(!result.contains(s)){
            result +=s;

            }
        }
        System.out.println(result);

    }
}
