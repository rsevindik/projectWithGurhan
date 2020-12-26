package SelfPractices_Summer_B20.Interview_Questions.ready_for_sublime;

import java.util.Arrays;

public class Practice_With_Saim {
    public static void main(String[] args) {

//        System.out.println("isArmstrong(153) = " + isArmstrong(153));
//        System.out.println("isArmstrong(155) = " + isArmstrong(155));
//        System.out.println("isPrimeNum(10) = " + isPrimeNum(10));
//        printAllPrimeNumsUpTo(100);
        //System.out.println("getSecondMaxNum of following number sequence (2,8,0,34,99,1,99) = " + getSecondMaxNum(2, 8, 0, 34, 99, 1, 99));
        // sumOfTheNumsFromString("sdfgfhjf234hk400jhu1lk5n67");
        System.out.println("isItArmstrong(143) = " + isItArmstrong(143));

    }

    public static boolean isArmstrong(int num) {
        String value = String.valueOf(num);
        int power = value.length();
        int sum = 0;

        for (int i = 0; i < value.length(); i++) {
            int digit = Integer.parseInt("" + value.charAt(i)); // if we do not use Integer and ""+ it will give ascii numbers
            sum += Math.pow(digit, power); // number ^ power == 1 ^ 3
        }
        return num == sum;
    }
    //second approach for the armstrong
    public static String isItArmstrong(int realNumber){
    int newNumber = 0;
    int singleNum = 0;
    int tempNumber = 0;

    tempNumber =realNumber;
        while(realNumber >0)

    {
        singleNum = realNumber % 10;
        realNumber = realNumber / 10;
        newNumber = newNumber + (singleNum * singleNum * singleNum);
    }
        if(tempNumber ==newNumber)
            return "is an armstrong number";
        else
            return "is Not an armstrong number";
}

    public static boolean isPrimeNum(int num) {
        if (num < 0) return false;       // we make sure that method excludes negative numbers
        for (int i = 2; i < num / 2; i++) { // we exclude 1 and the number with is only the requirements for prime numbers
            if (num % i == 0) {
                return false;
            }
        }
        return true;  // by default let's assume it's a prime (can be divided by only one and itself)
    }

    // print out all the prime numbers up to NUMBER(n)
    public static void printAllPrimeNumsUpTo(int number) {

        for (int i = 2; i < number; i++) { // we exclude 1 and the number with is only the requirements for prime numbers
            if (isPrimeNum(i)) {
                System.out.println(i);
            }
        }
    }
    // (int ... arr) is called variable arguments which allows you to put numbers back to back just like in an array
    public static int getSecondMaxNum (int ... arr){   // (int [] arr){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int eachNum : arr){
            if(eachNum > max){
                secondMax = max;
                max = eachNum;
            }
            if(eachNum > secondMax && eachNum < max){
                secondMax = eachNum;
            }
        }
        return secondMax;
    }

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int [] counter = new int [26]; // letters in alphabet and each index represent dif letter (a->0, b->1 ..)
        // all the couters must be zero if they both are the same strings consist of the same letters
        for (int i = 0; i < str1.length(); i++) {
            char str1Letter = str1.charAt(i);
            char str2Letter = str2.charAt(i);

            // apple
            // counter [0] = counter [0] +1;
            // a -> 97 ascii value
            // b -> 98

            counter [str1Letter - 97] = counter [str1Letter -97] +1;
            counter [str2Letter - 97] = counter [str2Letter -97] -1;

        }

        return Arrays.equals(counter, new int [26]);
    }
    /* second way .!!!
    a =a.replaceAll(" ", "").toLowerCase();
b =b.replaceAll(" ", "").toLowerCase();
if(a.length()==b.length()){
    for(int i=0;i<=a.length()-1;i++){
        if(b.contains(""+a.charAt(i))){
            b = b.replaceFirst(""+ a.charAt(i),"");
        }
    }
     */

    public static int sumOfTheNumsFromString(String str){
        int sum = 0;
        String num="";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                num+=str.charAt(i);
                if(i == str.length()-1 || !Character.isDigit(str.charAt(i+1))){
                    sum += Integer.parseInt(num);
                    num="";
                }
            }
        }
        return sum;
    }
    /* Second way.!!
    String temp="0";
 int Digit=0;
 // jav34ajs4jk6 //34+4+6=44
 for (int i = 0; i <st.length() ; i++) {
     if(Character.isDigit(st.charAt(i))){
         temp+=st.charAt(i); // "6"
     }
     else{                                //  34 =     0   +           34
                                         //  38   =     34  + 4
                                         //  44   =     38  + 6
         Digit+=Integer.parseInt(temp); // Digit=  Digit +  Integer.parseInt(temp)  temp="034"                  // Convert String into int
         temp="0";
     }
 }      //38+ 6
return Digit+Integer.parseInt(temp);

// 3rd way with if-else
public static void main(String[] args) {
    String str = "aa34bbb4ccc6d";
    int sum = 0;
    String temp ="";
    for (int i=0; i<str.length(); i++){
        if (Character.isDigit(str.charAt(i))){
            temp += str.charAt(i);
        }else{
            if (!temp.equals("")) {
                sum += Integer.parseInt(temp);
                temp = "";
            }
        }
    }
    System.out.println(sum);
}
     */

}
