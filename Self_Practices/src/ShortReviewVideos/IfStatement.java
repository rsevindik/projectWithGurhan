package ShortReviewVideos;

/* if(condition is true/false: boolean expiration) {
    do some action...
    }
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(inputs.nextInt()));

        if (inputs.nextInt() == 0) {
            Collections.swap(numbers, 0, 0);
            //break;
        }

        System.out.println(numbers);

        if (9 > 2) {  //if statement always goes into()parenthesis but
            // { is necessary only if you have more than one statement
            System.out.println("Control Flow Rock!");
        }

        int apples = 10;
        int oranges = 5;

        if (apples < oranges) {
            System.out.println("I have more apples than oranges"); // will only be executed if the statement is true
        }

        String userName = "abc";
        String inputUserName = "abc";

        if (userName.equals(inputUserName)) {    // if(userName.equals("abc")){  this is for the first and easiest part
            System.out.println("Access granted");
            System.out.println("Welcome agent.!");
        }

        int books = 5;
        if (books < 10) {
            books += 10;
        }
        System.out.println(books);

        boolean hot = true;
        if (hot) {     // if statement could be (hot == true) but hot will be always true so its not necessary.!
            System.out.println("Can I please get some ice?");
        }

        int age = 20;
        if (age >= 18) {
            System.out.println("Adult");

        }
        System.out.println("======================");
        int x = 10;
        int y = 15;

        if (x > y)
            System.out.println(x);
        if (y > x)
            System.out.println(y);
        if (y == x)
            System.out.println(x + " and " + y + " are equal");

        System.out.println("================================");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number here: ");
        int n = input.nextInt(); // since we will use it at least two times, we should assign it to another variable(reusable)

        if (n % 2 == 0)
            System.out.println(n + " is an even number.!");
        if (!(n % 2 == 0))
            System.out.println(n + " is an odd number.!");

        // or the second solution would be;

        if (input.nextInt() % 2 == 0) { // since we only use the given input for only one time, No need to create another variable.
            System.out.println(n + " is an even number.!");
        } else {
            System.out.println(n + " is an odd number.!");
        }
        System.out.println("==========================");
        // if n > 10 -> sout ">10"
        // else if n =10 -> sout " =10"
        // else -> sout " <10"

        int n1 = 10;
        if (n1 > 10)
            System.out.println(">10");
        else if (n1 == 10)
            System.out.println(" = 10");
        else
            System.out.println(" < 10"); // else always belong to the first if statement that is above it "if( n1 == 10)"

        System.out.println("====let's follow convention rules for the same solution (above)===");
        int n2 = 15;

        if (n2 > 10)
            System.out.println(">15");
        else if (n2 == 15)   // using if without else will separate 2 conditions; normally following statement
            // can be executed once the condition if the first if statement is false but
            // if you don't use else then  system will check this condition as well no matter what.!
            System.out.println(" = 15");
        else
            System.out.println(" < 15");
    }

    public static void getIntArray(int num) {

        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;

            System.out.println(sum);


            }
        }
    }











