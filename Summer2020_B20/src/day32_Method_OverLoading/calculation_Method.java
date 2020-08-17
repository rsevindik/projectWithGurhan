package day32_Method_OverLoading;

import java.util.Scanner;

public class calculation_Method {

    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first double number: ");
            double num1 = input.nextDouble();
            System.out.println("Enter the operator: ");
            char operator = input.next().charAt(0); // while using scanner there is no char option there for you should
                                                    // get it in form of string then convert it into char by "charAt(0);
            double num2 = input.nextDouble();
            System.out.println("Enter the second double number: ");

            double result = calculator(num1, operator,num2);

            System.out.println("The result is: "+result);

    }

            public static double calculator(double num1, char operator, double num2){

            double result = (operator == '+')? num1 + num2 :(operator == '-')? num1-num2 :(operator == '*')? num1*num2 :
                (operator == '/')? num1/num2 :(operator == '%')? num1%num2 :0;

            return result;

    }

}
