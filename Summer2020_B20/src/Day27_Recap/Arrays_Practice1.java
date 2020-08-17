package Day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Practice1 {
    public static void main(String[] args) {
        String [] names = {"Ali", "Erdem","Ramazan"};

        System.out.println(names[1]);  // Erdem
        System.out.println(names[0]); //Index 13 out of bounds for length 3

        System.out.println("==============================");

        for(int i = 0; i<=names.length-1; i++){
            // if( names[i].charAt(0) != 'A'  )
            if( !names[i].startsWith("A")  ){
                continue;
            }

            System.out.println( names[i]);
        }

        System.out.println("==============================");
        int [] numbers = new int [5]; // declare the size how many element will it contain

        System.out.println(numbers);

        numbers [3] = 25;
        numbers[0] = 100;
        numbers [3] = 100;//last initialization is the final of the variable's value

        System.out.println(Arrays.toString(numbers));

        System.out.println("=============================");
        Scanner scan = new Scanner(System.in);

        System.out.println("how many names do you want to enter?");
        String [] students = new String[scan.nextInt()];      ///////////one time use only. dont need to int num = 0;

        scan.nextLine(); // take out the enter in the scanner

        for (int i = 0; i <= students.length-1 ; i++) {
            System.out.println("Enter a name: ");

            students[i] = scan.nextLine();  //
        }

/*
 for (int i = students.length-1 ; i >= 0;  i--) {  // this way you will reverse directly what user enters....!!!
            System.out.println("Enter a name: ");

            students[i] = scan.nextLine();  //
        }
 */
        System.out.println(Arrays.toString(students));

    }
}
