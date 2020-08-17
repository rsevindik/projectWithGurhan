package ShortReviewVideos;

import java.util.Scanner;

/* if(condition is true) {
        Do some action...
    }else{
        Do something else..
    }
 */
public class IfElseStatement {
    public static void main(String[] args) {
/*
        boolean isWeatherNice = false;

        if(isWeatherNice) {
            System.out.println("Let's go swimming");
        }else{ // will not work without if statement because it means otherwise.!!
            System.out.println("Stay home, \nWatch a movie");
        }
 */
        Scanner input = new Scanner(System.in);
       /* System.out.println("Enter the username and password:");

        String userName = input.next();  // variable declaration and assigning a value occurs at the same time
        String password = input.next();

        String secretUserName = "admin";
        String adminPassword = "abc123";

        if(userName.equals(secretUserName) && password.equals(adminPassword)) {
            System.out.println("Access granted. Welcome agent.!");
        }else{
            System.out.println("Access Denied.!");
        }
         */

        System.out.println("Enter your current speed:");
        int currentSpeed = input.nextInt();
        int speedLimit = 70;
        int diff = currentSpeed - speedLimit;


        if(currentSpeed > speedLimit){
            System.out.println("Please slow down! Acceding the Speed Limit: " +diff+ " mi/h.");
            currentSpeed -= diff;
        }else{
            System.out.println("Thank you for not acceding speed limit.!");
        }

        System.out.println("Current speed after adjustment: " +currentSpeed+ "\nThank you.!");



    }
}
