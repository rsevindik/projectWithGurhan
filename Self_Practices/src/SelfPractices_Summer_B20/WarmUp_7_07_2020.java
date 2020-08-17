package SelfPractices_Summer_B20;

import java.util.Scanner;

public class WarmUp_7_07_2020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        int sum = 0;

        for(int i = 0; i < 100; ){
            System.out.println("What number you would like to add? ");
            int num = scan.nextInt();
            if(num<0){
                break;
            }
            sum += num;
        }
        System.out.println("You entered a negative number. The sum of the positive numbers you entered is: "+sum);

        System.out.println("=================================");

        System.out.println("enter your number:");
        int num = scan.nextInt();
        int sum2 = 1;
        String deBug = ""+num;

        for (int i = num; i > 1;i--) {
            sum2 *= i;
            deBug += " * "+ (i-1);
        }
        System.out.println("The sum of "+deBug+" is: " + sum2);
   */

        System.out.println("=============================");
        System.out.println("enter your str: ");
        String str = scan.nextLine();
        String removedDuplicates = " ";

        char ch = str.charAt(0);
        while(ch<=str.charAt(str.length()-1)){
            String s = " "+str.charAt(ch);
            if(removedDuplicates.contains(s)){
                ch++;        // in while loop if you are using continue; then need to add another iteration above it.!
                continue;
            }
            removedDuplicates +=s;
            ch++;
            System.out.println(removedDuplicates);
            }

            scan.close();
        }
    }


