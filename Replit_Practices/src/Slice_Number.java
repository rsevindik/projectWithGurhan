import java.util.Arrays;
import java.util.Scanner;

public class Slice_Number {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        num = scan.nextInt();

        digit1 = num/10000;  //1
        digit2 = (num%10000)/1000; //2
        digit3= (num%1000)/100; //3
        digit4= (num%100)/10;   //4
        digit5= num%10;   //5
        int [] nums = {digit1, digit2, digit3, digit4, digit5};
        for(int each  : nums ){
            System.out.println(each);
        }

        /*

        String num = input.next();

        String [] slicedNum = num.split("");
        for (String each : slicedNum){
            System.out.println(each);
        }

       */


    }
}
