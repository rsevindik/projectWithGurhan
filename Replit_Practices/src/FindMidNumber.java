import java.util.Scanner;

public class FindMidNumber {

    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        Scanner input = new Scanner(System.in);
        int midNum = 0;

        System.out.println("Enter first number:");
        int num1 = input.nextInt();

        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        System.out.println("Enter third number:");
        int num3 = input.nextInt();

        boolean num1Mid = num1>num2 && num1 < num3 || num1<num2 && num1 > num3;
        boolean num2Mid = !num1Mid  && num2>num3 || num2 < num3;
        boolean num3Mid = !(num1Mid && num2Mid);

        if(num1Mid){
            midNum = num1;
        }else if(num2Mid){
            midNum = num2;
        }else{
            midNum = num3;
        }
        System.out.println("Medium value is: " +midNum);
    }
}

