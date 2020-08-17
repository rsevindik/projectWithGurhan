package Day18_ForLoop;

import java.util.Scanner;

public class For_Loop {

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");


        for(int i = 1; i <= 10; i++){

            System.out.println("Ramazan Sevindik - "+i);
        }

        for(int i = 1; i <= 5; i++){

            System.out.println("Cybertek Batch 20, ");
        }
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("Done!");

        for(int i =100; i >=1 ; i--){
            System.out.print(i+" ");
        }
 System.out.println("============Task-1=================");

        for (int i = 0; i<= 100; i+=2) {
                System.out.print(i);
            }
        System.out.println();
        for (int i = 1; i<= 100; i+=2) {
            System.out.print(i);
        }
        System.out.println();
        for (char i = 'A'; i<= 'Z'; i++) {      // for (int i = 65; i<= 90; i++) {
            System.out.print(i);              // System.out.print((char)i);
        }
        System.out.println();

        for (char i = 97; i<= 122; i++) {  //a-z
            System.out.print(i);
        }
        System.out.println("================Tasks-2==================");

        for (int i = 1; i <= 32; i+=2) { // odd number between 1-32
            System.out.println("Odd number: "+i);
        }
        for (int i = 2; i <= 32; i+=2) { // even number between 2-32
            System.out.println("Even number: "+i);
        }
        for (int i = 1; i * i <= i*10;i++) {
            System.out.println(i * i);   // multiplication table (rows-columns)
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int i = 0;

        for (int positiveInteger = input.nextInt(); positiveInteger * ++i <= positiveInteger * 10;) {
            System.out.println(positiveInteger+ " x " +i+" = " +positiveInteger * i);   // multiplication chart of given positive integer #
        }
    }
}
