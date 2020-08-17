package Day21_Loops;

public class Divide_2_Num_WoutOperator {
    public static void main(String[] args) {
        /*
        interview question - dividing 2 numbers without operator
         */
        int a = 15;
        int b = 3;
        int c = a;
        int count = 0;
        /*
        if(b == 0){ // cuz it's undefined.!
        System.out.println(count+ " Invalid input");
        System.exit(0);
         */

        while(a>=b){
            a -= b;
            count++;

        }
        System.out.println(c +"/"+b+" = " +count+ " with a remainder of "+a);
    }
}
