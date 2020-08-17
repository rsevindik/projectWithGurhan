package day08_LogicalOperators;

public class Practice4 {

    public static void main(String[] args) {

        double num1 = 20;
        double num2 = 80;
        double result = (num1 + num2) * 25;
        double remainder = result % 40;

        boolean r = remainder <= 20;
        System.out.println(r);

    }
}
