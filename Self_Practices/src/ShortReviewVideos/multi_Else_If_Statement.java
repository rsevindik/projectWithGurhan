package ShortReviewVideos;
import java.util.Scanner;

/* import java.util.Scanner; you may have so many "else if" statements but all the conditional statements starts with

"If" and ends with "else" but its optional if you do not want to get any end results. */

public class multi_Else_If_Statement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your letter grade: ");
        char grade = input.next().charAt(0);
        String finalGrade = " ";

        if (grade == 'A'|| grade == 'a') {
            System.out.println("Excellent");
        } else if (grade == 'B'|| grade == 'b') {
            System.out.println("Good");
        } else if (grade == 'C' || grade == 'c') {
            System.out.println("Not Bad");
        } else if (grade == 'D'|| grade == 'd') {
            System.out.println("Could be better");
        } else {
            System.out.println("Failed");
        }
        /*
        finalGrade = (grade == 'A'|| grade == 'a')? "Excellent": (grade == 'B'|| grade == 'b')?"Good" :
                (grade == 'C' || grade == 'c')?"Not Bad":(grade == 'D'|| grade == 'd')? "Could be better": "failed";
        System.out.println(finalGrade);
         */
        System.out.println("=================================");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your shoe size: ");
        int size = scan.nextInt();
        String stock = " ";

        if(size > 12){     // conditional statement will be compile in the same order meaning that if the first option
            // is true then compile will not execute the following options even though they are true.!
            // for example if you switch 1. and the 2. condition and enter 15, end result will be "..in stock"..
            System.out.println("Sorry, your shoe size is not in the stock");
        }else if(size >= 6){
            System.out.println("Your shoe size is in the stock");
        }else{
            System.out.println("Sorry, this store does not carry smaller than size 6.");
        }
        /*
        stock = (size > 12)? "Sorry, your shoe size is not in the stock" :(size >= 6)?
                "Your shoe size is in the stock" : "Sorry, this store does not carry smaller than size 6.";
        System.out.println(stock);
        */

        System.out.println("============================");

        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        // String range = " ";    only if you want to change certain sout ".." into an generic one.!
        // or just add it as the variable type and name in front of the TERNARY statement
        if(number >= 0 && number <= 100){
           System.out.println("Number is between 0 - 100");
        }else if(number > 100 && number <= 1000){
           System.out.println("Number is between 101 - 1000");
        }else if(number > 1000 && number <= 1000000) {
           System.out.println("Number is between 1001 - 1000000");
        }else{
           System.out.println("Number is either 'negative' or more than '1000000'.");
        }
        /*
        String range = (number >= 0 && number <= 100)? "Number is between 0 - 100":(number > 100 && number <= 1000)?
                "Number is between 101 - 1000":(number > 1000 && number <= 100000)?"Number is between 1001 - 1000000":
                "Number is either 'negative' or more than '1000000'";
        System.out.println(range);
        */

    }
}
