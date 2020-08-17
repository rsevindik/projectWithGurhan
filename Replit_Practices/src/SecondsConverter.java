import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner input = new Scanner(System.in);

        System.out.println("Enter seconds:");
        int inputSecond = input.nextInt();
        int hours = inputSecond/3600;
        int minutes = (inputSecond-hours*3600)/60;
        int seconds = (inputSecond - hours*3600)%60;
        System.out.println(hours + " hours, "+minutes+" minutes, and "+seconds+" seconds");

        input.close();
    }
}
