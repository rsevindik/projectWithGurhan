package SelfPractices_Summer_B20.Interview_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Practice_With_Saim2 {
    public static void main(String[] args) {
//        System.out.println("isNumberPalindrome(12345) = " + isNumberPalindrome(12345));
//        System.out.println("isNumberPalindrome(1234321) = " + isNumberPalindrome(1234321));
        // fibonacci(8);
      //  System.out.println("fibonacci2(8) = " + fibonacci2(8));
        System.out.println("isBalanced(\" [ { } ) ]\") = " + isBalanced("[({})]"));
        // be careful about spaces must be the same as String open = "{[(";
    }

    public static boolean isNumberPalindrome(long number) {

        long reverse = 0;
        long temp = number;

        //using %10 we can read the last digit as one single num at a time
        while (temp != 0) {

            reverse = reverse * 10 + (temp % 10); //1 which stays in tens(0+1=1)
            // 10+2=12
            temp /= 10; //temp = temp/10
        }
        return reverse == number;
    }

    public static void fibonacci(int num) {
        // 0,1,1,2,3,5,8,13,21,..

        int a = 0;
        int b = 1;
        System.out.print(a);

        for (int i = 1; i < num; i++) {
            System.out.print("" + b);
            int next = a + b;
            a = b;
            b = next;
        }
    }

    //fibinacci solution with recursion for interview purposes
    public static int fibonacci2(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci2(n - 1) + fibonacci2(n - 2);
    }

    //balancing brackets { ( [  opening and closing
    public static boolean isBalanced(String str) {
        String open = "{[(";      // does not matter if there is space or not

        Stack<Character> stack = new Stack<>(); // LIFO
        Map<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');

        for (int i = 0; i < str.length(); i++) {
            if(str.length()%2!=0){
                return false;
            }
            if (open.contains("" + str.charAt(i))) {
                // this char is one of the opening brackets
                stack.push(str.charAt(i));

            } else {
                // this char is one of the closing brackets
                if (stack.isEmpty() || str.charAt(i) != map.get(stack.pop())) {  // will check if ] == ]
                    // will check if ) == )
                    // will check if } == }
                    return false;
                }
            }
        }

        /*
        stack
                [
                (
                {
         */
                return stack.isEmpty();
    }
}






