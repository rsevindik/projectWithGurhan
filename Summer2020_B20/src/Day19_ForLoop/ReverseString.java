package Day19_ForLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //String str = "Cybertek School is a cool place";  // "rebyC"
        //            01234

        //String result = ""+str.charAt( 4 ) + str.charAt(3) + str.charAt(2) + str.charAt(1) +str.charAt(0) ;

        String result = ""; //rebyC

        for(int i = str.length()-1 ; i >= 0; i-- ){ //i: 4, 3, 2, 1, 0
            //result +=  str.charAt(i);
            result += str.substring(i,i+1);
        }


        System.out.println(result);
    }
}
