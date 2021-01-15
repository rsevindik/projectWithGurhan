package SelfPractices_Summer_B20.Interview_Questions.interview_practice_with_rahul;

public class Practice_3_1 {
    /*
    1. Write a java program to reverse a given number
    2. Write a java program to reverse the given string
    3. Write a java program for Swapping 2 String without using the 3rd temp variable.
    4. Various operations on a given String
    5. Remove special characters and junk characters from a String.
     */
    public static void main(String[] args) {

        reverseInt(12345);
        //second way;  // reverse a number .!!
        int num = 54321;
        StringBuffer sbf = new StringBuffer(String.valueOf(num));
        StringBuffer reversed = sbf.reverse();
        System.out.println("reversed number is " + reversed);

        // =============== Reverse a string =============== //
        System.out.println(reversedStr("Zaman"));
        //second way;
        String str = "Namaz";
        StringBuffer sbf2 = new StringBuffer(str);
        StringBuffer reversedStr = sbf2.reverse();
        System.out.println("reversed string is " + reversedStr);

        //3rd way; *** good for time complexity
        String str4 = "Ozan";
        int low = 0;
        int high = str4.length() - 1;
        char[] ch = str4.toCharArray();
        while (low < high) {
            char c = ch[low];
            ch[low] = ch[high];
            ch[high] = c;
            low++;
            high--;
        }
        System.out.println(String.valueOf(ch));

        // ============ Swap 2 Strings ================== //
        String a = "Ramazan";
        String b = "Adam";
        /*
        a, b ==> a=a+b; ==> substring(....);
         */
        System.out.println("current a value is "+a);
        System.out.println("current b value is "+b);

        a = a+b; //RamazanAdam
        b = a.substring(0,a.length()-b.length()); // Ramazan (b)
        a = a.substring(b.length(),a.length() );  // Adam (a)

        System.out.println("new a value is "+a);
        System.out.println("new b value is "+b);

        // =========== Utilizing String Methods =============== //
        String str1="Hello in the Java world";
        String str2="Good Morning and ";
        // length of the string
        System.out.println("Length of str1: "+ str1.length());
        //Printing a character at a position
        System.out.println("Character at 5th position is : "+str1.charAt(6));
        // find the index of any character
        System.out.println("Index of a is : "+str1.indexOf("a"));
        // find the index of 2nd of any character such as "a"
        System.out.println("index of -a- after index 14 (2nd one):  " + str1.indexOf("a",str1.indexOf("a")+1));
        System.out.println("index of -l- after index 3 (3rd one):  " + str1.indexOf("l",str1.indexOf("l",str1.indexOf("l")+1)));
        // String comparison
        System.out.println(str1.equals(str2) );
        // sub string
        System.out.println(str1.substring(3, 6));
        // replace
        System.out.println(str1.replace(" ", ""));
        //Upper-Lower case
        System.out.println(str1.toLowerCase());
        // split
        String splitString[]= str1.split("");
        for(int i=0;i<str1.length(); i++)
        {
            System.out.print(splitString[i]+"-");
        }
        System.out.println();
        // =========== Remove special & junk chars from a String =============== //
        String str3="@##@#@@$@$%%^helloworld@$@%%!".toUpperCase();
        char arrStr3 [] = str3.toCharArray();
        String newStr3 = "";
        for( char each  :  arrStr3){
            if(each >= 65 && each<=90){
                newStr3 +=each;
            }
        }
        System.out.println("newStr3 = " + newStr3);
        String newStr3WithCapInit = newStr3.substring(0,1)+newStr3.substring(1).toLowerCase();
        System.out.println("capInitNewStr3 = " + newStr3WithCapInit);

    } /** Main method ends here */

    public static void reverseInt(int num){ //12345
        int reversed=0; //accumulator
        while(num!=0){
            reversed = reversed*10 + num%10;// reversed=5 / num = 1234
            num=num/10;
        }
        System.out.println("reversed number is "+ reversed);
    }

    public static String reversedStr(String str){
        String result = "";
        for (int i = str.length()-1 ; i >=0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }


    }/** Class ends here */

