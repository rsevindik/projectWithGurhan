import java.util.Scanner;

public class Simple_Calculator_Methods1 {

    public static void main(String[] args) {

        plus();
    }

    public static void plus(){

        //your code here
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt(),n2 = input.nextInt();
        int sum = n1+n2;
        System.out.println("result: "+sum);

    }
}
