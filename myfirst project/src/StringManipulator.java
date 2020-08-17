import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner (System.in);

        System.out.println("What is your favorite City?");

        String favoriteCity = keyboard.next();
        String upperCase = favoriteCity.toUpperCase();
        String lowerCase = favoriteCity.toLowerCase();
        char firstChar = favoriteCity.charAt(0); // it starts from zero.!
        int stringSize = favoriteCity.length();

        System.out.println(favoriteCity + " has total numbers of "+ stringSize+ " letters.");
        System.out.println("The first letter in " +favoriteCity+ " is; " +firstChar);
        System.out.println(upperCase + " ..");
        System.out.println(lowerCase+ " ..");


    }
}
