import java.util.Scanner;

public class WarmUp_7_08_2020 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
    /*
        String username = "";
        String password = "";

        int counter = 0;

        do {
            System.out.println("Please enter your username:");
            username = scan.nextLine();
            counter++;
            if (counter == 3) {
                System.out.println("your account is block");
                System.exit(0);
            }

            }while (!(username.equals("john")));
                System.out.println("Please enter your password");
                password = scan.nextLine();

        int counter2 = 0;

        do {
            System.out.println("Yuo have "+counter2+ " more attempts!");
            password = scan.nextLine();
                counter2++;
            if (counter2 == 3) {
                    System.out.println("your account is block");
                    System.exit(0);
            }

            }while (!password.equals("123"));
                System.out.println("logged in");

        System.out.println("======================");
/*
        String user = "john";
        String passWord = "123";
        int count = 0;
        for (int i = 3; i >= 1; i--) {
            System.out.println("name: ");
            String userName = scan.nextLine();
            System.out.println("password: ");
            String userPassword = scan.nextLine();

            while (userName.equals(user) && userPassword.equals(passWord)) {
                System.out.println("Logged in.!");

                System.exit(0);
            }
        }
        System.out.println("Account Blocked.!");
     */

    /*
        System.out.println("=============min-max=============");

        int min = 999999999;
        int max = -999999999;

        for (int i = 1; i <=5; i++) {
            System.out.println("enter a number: ");
            int num= scan.nextInt();

            if (num < min){
                min = num;
            }
            if(num > max){
               max = num;
            }
        }
        System.out.println("Minimum number among those numbers is: " +min);
        System.out.println("Maximum number among those numbers is: " +max);

*/       int max = -2147483648;;
        int j = 1;
        while(j <= 5){

            System.out.println("Enter a number");
            int n = scan.nextInt();

            if(n > max ){
                max = n;
            }

            j++;
        }
        System.out.println("max: "+max);

    /*
         System.out.println("====dividing/multiplying without operators===");

        int a = 30;
        int b = 5;
        int c = a;
        int count = 0;
        while(a>=b){
            a-=b;
            count++;
        }
        System.out.println(c+" divided by "+b+ " is: "+count+" with a reminder of "+a);

        int x = 3;
        int y = 6;
        int z = x;
        int count = y;
        int result = 0;

        while(count>0){
            result+=x;
            count--;
        }
        System.out.println(z+" multiplied by "+y+ " is: "+result);

         */
    /*
        System.out.println("==========first attempt============");
        String username;
        String password;
        int counter = 3;
        do {
            System.out.println("Please enter your username:");
            username = scan.nextLine();
            counter--;
            if (counter == 0) {
                System.out.println("your account is block");
                System.exit(0);
            }
            do {
                System.out.println("Please enter your password");
                password = scan.nextLine();
                counter--;
                if (counter == 0) {
                    System.out.println("your account is block");
                    System.exit(0);
                }

            } while (!(username.equals("john")));
            System.out.println("You have " + counter + " attempts for password entry!");
        }while (!(password.equals("123")));
        System.out.println("Logged in.!");

        */
/*
        System.out.println("=============second attempt===============");

        String username;
        String password;
        int counter1 = 3;
        int counter2 = 3;
        do {
            System.out.println("Please enter your username:");
            username = scan.nextLine();
            counter1--;
            if (counter1 == 0) {
                System.out.println("your account is block");
                System.exit(0);
            }
        }while (!(username.equals("john")));
        System.out.println("You have " +counter2+ " attempts for password entry!");
        do {
            System.out.println("Please enter your password");
            password = scan.nextLine();
            counter2--;
            if (counter2 == 0) {
                System.out.println("your account is block");
                System.exit(0);
            }
        }while (! (password.equals("123")));
        System.out.println("Logged in.!");

        */

        for (int i = 3; i >= 1; i--) {
            System.out.println("Enter username:");
            String userInput = scan.next();
            System.out.println("Enter password:");
            String passwordInput = scan.next();
            if(userInput.equals("Ramazan") && passwordInput.equals("Sevindik")) {
                System.out.println("Logged in.!");
/**
            while (userInput.equals("Ramazan") && passwordInput.equals("Sevindik")) {
                System.out.println("Logged in.!");
                System.exit(0);
            }
        }
        System.out.println("Your account is locked!");
*/
                break;
            }else if (i>1) {
                System.out.println("Incorrect username or password, please try again!");
            }else{
                System.out.println("Your account is locked!");
            }
        }

        /*
        Write a program that asks user to enter a string. If string started with uppercase and ends with lowercase
        letter then print true, otherwise print false

        Ex:
        Input: Cybertek
        output: true
        Input: CyberteK
        output: false

   Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
        Ex
        Input: AABAAC
                A
        Output: 4
        Input: ABCC
                C
        Output: 2

         */

    }
}