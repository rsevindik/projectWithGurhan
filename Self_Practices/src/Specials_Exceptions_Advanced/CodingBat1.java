package Specials_Exceptions_Advanced;
/*
Puzzle Answers
test1:
             bool
           true  false
num >=90   A     A

num < 90   B     A

test2:
               bool
            true  false
num >= 90    Tic    Tac

20<=num<90   Tac    Tac

num < 20     Toe    Toe
 */
public class CodingBat1 {
    public static void main(String[] args) {
int num = 0;
boolean bool= true;

        if (num >= 90 || !bool) {
            System.out.println("A");
        }
        else {
            System.out.println("B");
        }

        System.out.println("================");

        if (num >= 90 && bool) {
            System.out.println("Tic");
        }
        else if (num >= 20) {
            System.out.println("Tac");
        }
        else {
            System.out.println("Toe");
        }



    }
}
