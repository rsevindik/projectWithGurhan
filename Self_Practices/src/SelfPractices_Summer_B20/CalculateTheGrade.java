package SelfPractices_Summer_B20;

public class CalculateTheGrade {
    public static void main(String[] args) {

        /*
        int grade = 58;

        if(grade > 90){
            System.out.println("Excellent");
        }
        if(grade > 70 && grade < 90){
            System.out.println("Good");
        }
        if(grade > 60 && grade < 70){
            System.out.println("Pass");
        }
        if(grade < 60){
            System.out.println("Fail");
        }
        */

        int score = 85;
        if(90 < score && score< 100){
            System.out.println("A");
        }
        if(80 < score && score< 90){
            System.out.println("B");
        }
        if(70 < score && score< 80){
            System.out.println("C");
        }
        if(60 < score && score< 70){
            System.out.println("D");
        }
        if(score< 60){
            System.out.println("F");
        }



    }
}
