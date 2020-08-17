package Day23_Arrays;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        String [] days = new String [7];

        days [6] = "Sun";
        days [1] = "Tue";
        days [4] = "Fri";
        days [3] = "Thu";
        days [2] = "Wed";
        days [5] = "Tue";
        days [0] = "Mon";

        for (int i = 0; i <=6 ; i++) {
            System.out.println(days[i] +" ");

        }
        System.out.println("===========================");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 1 and 7 for days");
        int n = input.nextInt();

        System.out.println(days[n-1]);
    }
}
