package Day16_String;

import java.util.Scanner;

/*
write a program to ask the user enter two number and a math operator.
        ex:
            10
            20
            *
        output:
            200
            10
            2
            /
        output:
            5
    valid math operators are: *, / , +, -, %
    Nested If
 */
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter your math operator: ");
        char operator = input.next().charAt(0);

        System.out.println("Enter your second number: ");
        double num2 = input.nextDouble();

        boolean valid = operator == '*' || operator == '/' ||operator == '%' ||operator == '+' ||operator == '-';

        double result = 0;

        if(valid){
            switch(operator){
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                case '+':
                    System.out.println(num1+num2);
                    break;
                case '-':
                    System.out.println(num1-num2);
                    break;
            }

        }else{
            System.out.println("Invalid Operator");
        }

       // result = (valid) ? (num1 + operator + num2) : -1;   What would be the easiest way????
        result = (operator == '*')? num1*num2 :(operator == '/')? num1/num2 :(operator == '%')? num1%num2 :
                (operator == '+')? num1+num2 :(operator == '-')? num1-num2 :0;

        System.out.println(result);

    }

}
