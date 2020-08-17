import java.util.Scanner;
public class MaleAndFemalePercentages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter the Total Numbers of male students enrolled in this class:");
        int maleStudents = keyboard.nextInt();

        System.out.println("Please Enter the Total Numbers of female students enrolled in this class:");
        int femaleStudents = keyboard.nextInt();

        double totalStudents = maleStudents + femaleStudents; //even though # of students are integer value since
                                        // you are using double for percentages stick to use it for them as well.!
        double malePercentage = maleStudents / totalStudents;
        double femalePercentage = femaleStudents / totalStudents;

        System.out.println("The percentage of the male students in this class is: " + malePercentage+ " %");
        System.out.println("The percentage of the female students in this class is: " + femalePercentage+ " %");

    }
}
