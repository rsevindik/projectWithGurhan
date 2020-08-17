package ShortReviewVideos;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) throws InterruptedException {
       /*
        int apples = 1;
        while(apples <=10){
            System.out.println("eating an apple at a time!"); // if we add (+apples++) will also count the apples get eaten.!
            apples++;  // if you enable this iteration/limitation will create infinite apples eaten.!
        }
        System.out.println("No more apples:( you eat "+(apples-1));//why have to put -1????

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int count = 1;
        while(count <=number){
            System.out.print(count + ", ");
     // System.out.println(count + ": Believe in yourself and be patient (actively), you will be a great programmer one day.!");
            count+=2;   //instead of using a plain increment (count++ for ic by 1) use count+=2 for skipping numbers.!!
     // Thread.sleep(1000); //without adding (throws InterruptedException) end of the main method it won't w.)

        }
    }
}
