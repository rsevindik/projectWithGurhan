package SelfPractices_Summer_B20;

import java.util.Scanner;

public class CalculateWithNestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter you operator: ");
        char operator = input.next().charAt(0);

        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();

        boolean validOperator = operator == '*' ||operator == '/' ||operator == '%' ||operator == '+' ||operator == '-';

        if(validOperator){
            if(operator == '*'){
                System.out.println(firstNumber*secondNumber);
            }else if(operator == '/'){
                System.out.println(firstNumber/secondNumber);
            }else if(operator == '%'){
                System.out.println(firstNumber%secondNumber);
            }else if(operator == '+'){
                System.out.println(firstNumber+secondNumber);
            }else if(operator == '-'){
                System.out.println(firstNumber-secondNumber);
            }
        }else{
            System.out.println("Invalid Entry. Please choose between following operators; *, /, %, +, -");
        }
    }
}
