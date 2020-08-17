package SelfPractices_Summer_B20;

import java.util.Scanner;

public class WarmUp_07_11_2020 {
    public static void main(String[] args) {

        String str = "aabbbbbbbccdeeeeefhjjjjlllsccccc";

        String uniqueChars = " ";

        for (int i = 0; i <= str.length()-1 ; i++) {
            char ch1 = str.charAt(i); // each char
            int count1 = 0;
            for (int j = str.length() - 1;j>=0; j--) {
                char ch2 = str.charAt(j); // each char back word
                if (ch1 == ch2) {
                    count1 += 1;

                }
            }
            if (count1 == 1) {
                uniqueChars += ch1;
            }
        }
        System.out.println(uniqueChars);
 /*
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a string:");
        String str2=input.nextLine().toLowerCase();
        for (int i = 0; i < str2.length();i++){
            if (str2.indexOf(str2.charAt(i)) == str2.lastIndexOf(str2.charAt(i))) {

                System.out.print(str2.charAt(i));
            }
        }
        System.out.println();

        System.out.println("============================");

        Scanner input = new Scanner (System.in);
        System.out.println("how many numbers do you want to enter?");
        int howMany = input.nextInt();
        int [] numbers = new int [howMany];
        System.out.println("enter you numbers");
        int i =0;
        while(i<=howMany-1){
            numbers[i] = input.nextInt();
            System.out.println("Numbers " + numbers[i]);
            i++;
        }

        int max = numbers[0];
        int min = numbers[0];

        for (i = 0; i <= numbers.length-1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
        for (i = 0; i <= numbers.length-1; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);

        System.out.println("============================");

        int numbers2 [] = {1,5,8,10,35};
        double sum= 0;

        for (int j = 0; j <= numbers2.length-1 ; j++) {
             sum += numbers2[j];
        }
        System.out.println("average is: "+sum/numbers2.length);

 */


        }
    }




