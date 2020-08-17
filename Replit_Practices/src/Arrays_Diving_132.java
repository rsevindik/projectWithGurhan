import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Diving_132 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        for( int i =0; i<7 ; i++ ){
            System.out.println("Enter score for judge "+(i+1)+":");
             score[i] = input.nextFloat();
        }

        System.out.println("Enter difficulty");
        float degreeOfDiff = input.nextFloat();


        float min = score[0];
        for (int i = 0; i <7 ; i++) {
            float scores = score[i];
            if(scores<=min){
                min=scores;
            }
        }

        float max = score [0];
        for (int i = 0; i <7 ; i++) {
            float scores = score[i];
            if(scores>=max){
                max = scores;
            }
        }
        float sum = 0;
        for (int i = 0; i <7 ; i++) {
            sum += score[i];
        }

        float total = (sum-min-max)*(.6f*degreeOfDiff);


        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }

}
