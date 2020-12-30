package SelfPractices_Summer_B20.Interview_Questions;

public class Practice_With_Saim2 {
    public static void main(String[] args) {
        System.out.println("isNumberPalindrome(12345) = " + isNumberPalindrome(12345));
        System.out.println("isNumberPalindrome(1234321) = " + isNumberPalindrome(1234321));
    }

    public static boolean isNumberPalindrome(long number){

        long reverse = 0;
        long temp = number;

        //using %10 we can read the last digit as one single num at a time
        while(temp != 0){

            reverse = reverse *10 + (temp %10); //1 which stays in tens(0+1=1)
                                                    // 10+2=12
            temp /= 10; //temp = temp/10
        }
        return reverse == number;
    }
}
