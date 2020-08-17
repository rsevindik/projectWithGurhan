package Office_Hours.Practice_7_07_2020;

import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); //"Batch20 is great and capable of doing anything.!";
        String result = "";
        for (int i = str.length()-1; i >=0 ; i-=1) {
            result += str.charAt(i);
        }
        System.out.println(result);

        System.out.println("=========with-WhileLoop=========");
        String result2 = "";
        int index = str.length()-1;
        while(index >=0){

            result2 += str.charAt(index);
            index -=1;
        }
        System.out.println(result2);
    }
}
