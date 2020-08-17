import java.util.Scanner;

public class Loop_Calculate_SumOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int sum = 1;
        String deBug = "  "+1;   // starting point:1 "+" comes after.!

        for (int i = 2; i <=n;i++) {
            sum += i;
            deBug += " + "+i;
        }
        System.out.println("sum = "+deBug+" = "+ sum);

        s.close();

    }
}
