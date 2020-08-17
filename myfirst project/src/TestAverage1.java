import java.util.Scanner;
public class TestAverage1 {
    public static void main(String[] args) {

        int score1, score2, score3;
        double average;
        char repeat;
        String input;

        System.out.println("This program calculate the "+
                "average of three test scores:");

        Scanner sc = new Scanner (System.in);

        do{
            System.out.println("Enter score #1:");
                    score1 = sc.nextInt();
            System.out.println("Enter score #2:");
                    score2 = sc.nextInt();
            System.out.println("Enter score #3:");
                    score3 = sc.nextInt();

            //Consume the remaining newline
            sc.nextLine();

            average = (score1+score2+score3)/3.0;

            System.out.println("The average is "+average);

            System.out.println("Would you like to average " +
                    "another set of test scores?");
            System.out.println("Enter Y or yes, N or no:");

            input = sc.nextLine();
            repeat = input.charAt(0);


        }while(repeat == 'Y' || repeat == 'y');


    }
}
