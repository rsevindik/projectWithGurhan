package SelfPractices_Summer_B20.Interview_Questions.interview_practice_with_rahul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice_2 {
    public static void main(String[] args) {
       // fibonacci(9);
       // System.out.println("isPrimeNum(9) = " + isPrimeNum(9));
       // System.out.println("isPrimeNum(11) = " + isPrimeNum(11));
       // minNumOf2DArray(new int [][]{{1,2,3,4}, {9,8,7,6,5}, {-1,-5,-9}});
       // System.out.println( isPalindrome("Anna"));
       // frequencyOfEachElement(new int[] {1,5,5,5,5,7,9,3,3,3,3,3,1,7,7});
        System.out.println(occurenceOfCharInStr("Ramazan", 'a'));

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < i; j++) { // will print char(*) as the same as line/row's number
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void fibonacci(int rangeUpTo){
        // 0-1-1-2-3-5-8-13-21-..
        int firstN = 0;  // 1 - 1 - 2
        int secondN = 1; // 1 - 2 - 3
        int i = 1;       // 2 - 3 - 4
        int sum;        // 2 - 3 - 5

        while(i <= rangeUpTo){
            sum=firstN+secondN;      // 0 + 1 = 1
            System.out.println(sum); // 1
            firstN=secondN;          // first = second and second = sum (3rd)
            secondN=sum;
            i++;
        }
    }

    public static boolean isPrimeNum(int num){
        boolean result = true;
        for (int i = 2; i <num/2 ; i++) { //starts from 2 coz all numbers can be divisible by 1 and half way will give the overall result do not need to go any further.!
            if(num%i == 0){      // it's not a prime num
                result = false;
                break;
            }
        }
        return result;
    }

    public static void minNumOf2DArray(int [][] arr2D){
        int min = arr2D[0][0];                           //int max =
        for (int i = 0; i <arr2D.length ; i++) {
            for (int j = 0; j <arr2D[i].length ; j++) {
                if(arr2D[i][j] < min){                  //.. > max
                    min = arr2D[i][j];                  // max = ...
                }
            }
        }
        System.out.println(min);                        // sout(max);
    }

    public static String isPalindrome (String str){
        String reversed = "";
        String result = "";
        for (int i = str.length()-1;i>=0; i--) {
            reversed += str.charAt(i);
        }
        if(reversed.equalsIgnoreCase(str)){
            result = "\""+str+"\""+ " is palindrome";
        }else{
            result = "\""+str+"\""+ " is NOT palindrome";
        }
        return result;
    }

    public static void frequencyOfEachElement(int [] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            int count = 0;   // ***** must be inside the loop to be reset after each count.!
            if(!list.contains(arr[i])){
                list.add(arr[i]);
                count++;
                for (int j = i+1; j <arr.length ; j++) {
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
                // System.out.println(arr[i]+" - "+count);  // must also be inside the loop the print result following each and every iteration/retrieving
                if(count ==1) System.out.println(arr[i]+" is unique number.!");
            }
        }
    }

    public static int occurenceOfCharInStr(String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
        /*
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));
        int occurrence = Collections.frequency(list, ch);
        return occurrence;
        */
    }
}
