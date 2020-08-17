import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        // DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int day = scan.nextInt();

        //WRITE YOUR CODE HERE

        String NameOfTheDay = " ";

        switch(day){
            case 1:
                NameOfTheDay = "Monday";
                break;
            case 2:
                NameOfTheDay = "Tuesday";
                break;
            case 3:
                NameOfTheDay = "Wednesday";
                break;
            case 4:
                NameOfTheDay = "Thursday";
                break;
            case 5:
                NameOfTheDay = "Friday";
                break;
            case 6:
                NameOfTheDay = "Saturday";
                break;
            case 7:
                NameOfTheDay = "Sunday";
                break;
            default:
                NameOfTheDay = "Not a valid entry!";
                break;
        }
        System.out.println(NameOfTheDay);
        scan.close();
    }
}
