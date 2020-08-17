import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        // DO NOT CHANGE
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month number");
        int monthNum = scan.nextInt();

        //WRITE YOUR CODE HERE:
        String NameOfTheMonth = " ";

        switch(monthNum){
            case 1:
                NameOfTheMonth = "January";
                break;
            case 2:
                NameOfTheMonth = "February";
                break;
            case 3:
                NameOfTheMonth = "March";
                break;
            case 4:
                NameOfTheMonth = "April";
                break;
            case 5:
                NameOfTheMonth = "May";
                break;
            case 6:
                NameOfTheMonth = "June";
                break;
            case 7:
                NameOfTheMonth = "July";
                break;
            case 8:
                NameOfTheMonth = "August";
                break;
            case 9:
                NameOfTheMonth = "September";
                break;
            case 10:
                NameOfTheMonth = "October";
                break;
            case 11:
                NameOfTheMonth = "November";
                break;
            case 12:
                NameOfTheMonth = "December";
                break;
            default:
                NameOfTheMonth = "Invalid number!";
                break;
        }

        System.out.println(NameOfTheMonth);

        scan.close();
    }
}
