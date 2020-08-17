package Day12_Switch_Scanner;

public class Switch {

    public static void main(String[] args) {

        int num = 1;
       // String result = " "; can be also used by assigning result instead of print.!

        switch (num){

            case 5:
                System.out.println("Friday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");  // can be anywhere within the switch .!
                break;
            case 7:
                System.out.println("Sunday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); // break; is not necessary for the last one due to }

        }


    }


}
