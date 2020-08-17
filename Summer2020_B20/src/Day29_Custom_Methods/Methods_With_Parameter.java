package Day29_Custom_Methods;
import java.util.Scanner;

public class Methods_With_Parameter {


    public static void main(String[] args) {

        printHello(5);

        System.out.println("=======================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current year and birth year");
        /*
        int birthYear = scan.nextInt();
        int currentYear = scan.nextInt();
    */
        age( scan.nextInt(), scan.nextInt() ); // if using info one time no additional variable creation necessary.!

    }


    public static  void  printHello(int numberOfTimes){

        for(int i=0; i < numberOfTimes; i++){
            System.out.println("Hello World");
        }

    }


    public static void age(int currentYear , int birthYear){

        if(currentYear < birthYear){
            System.out.println("Invalid Entry");
        }else {
            int age = currentYear - birthYear;
            System.out.println("You are " + age + " years old");
        }

    }


}

