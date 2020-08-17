import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();


        int ValueOfSum = num1 + num2 + num3;

        System.out.println("Sum of numbers: "+ValueOfSum);
        scan.close();
    }
}
