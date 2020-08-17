import java.util.Scanner;

public class BuildARoute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting letter");
        String start = scan.next().toUpperCase();
        System.out.println("Enter the ending letter");
        String end = scan.next().toUpperCase();
        String pathWay = "A right B down C left D up A right B down C left D";
        int startIndex = pathWay.indexOf(start);
        int endIndex = pathWay.lastIndexOf(end);


        String navigation = pathWay.substring(startIndex, endIndex);

        if (navigation.contains("A")) {
            navigation = navigation.replace("A", ">");
        }
        if (navigation.contains("B")) {
            navigation = navigation.replace("B", ">");
        }
        if (navigation.contains("C")) {
            navigation = navigation.replace("C", ">");
        }
        if (navigation.contains("D")) {
            navigation = navigation.replace("D", ">");
        }
        System.out.println(navigation + ": " + end + " found");
    }
}
