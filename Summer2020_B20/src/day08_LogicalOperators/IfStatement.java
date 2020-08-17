package day08_LogicalOperators;

public class IfStatement {

    public static void main(String[] args) {

        int a = 100, b = 100;

        if(a > b){
            System.out.println(a + " is the larger number!");
        }
        if(b>a){
            System.out.println(b+ " is the max number!");
        }
        if(a == b){
            System.out.println(a+ " is equal to " +b);

            System.out.println("=======================");

            boolean BreakTime = false;  // false will execute: take 15 min break
                                        // true then will execute keep studying.!

            if(BreakTime){
                System.out.println("Take 15 min break.!");
            }
            if(!BreakTime){
                System.out.println("Keep Studying.!");
            }

            boolean Corona = true;
            if(Corona == true) {
                System.out.println("Social Distancing.!");
            }

        }

    }
}
