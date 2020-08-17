import java.util.Scanner;
/*
Assume that the int variables i and j have been declared, and that n has been declared and initialized.
Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.
For Example:
input: 5
output: *
output: **
output: ***
output: ****
output: *****
 */
public class Print_Triangle {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int k = 1; k <=n ; k++) {
            for (int m = 1; m <=k ; m++) {
                System.out.print(" * ");
              }
            System.out.println();
        }

    }
}
