package Day24_Arrays;

import java.util.Scanner;

public class Uniques2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String expectedResult = "";


        for (int j = 0; j <= str.length()-1 ; j++) {
            char ch1 = str.charAt(j);      // a a  b  c c d
            int count = 0;                 // 1+1 NA

            for (int i = 0; i <= str.length()-1 ; i++) {
                char each = str.charAt(i); // a a b c c d
                if(ch1 == each){           //
                    count+=1;
                }
            }
            if(count == 1){
                expectedResult += ch1;
        }
    }

        System.out.println(expectedResult);
    }
}
