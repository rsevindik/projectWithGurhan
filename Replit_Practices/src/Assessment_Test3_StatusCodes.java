import java.util.Scanner;

public class Assessment_Test3_StatusCodes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int statusCode = scan.nextInt();
       String result ="";
        switch(statusCode){

            case 200:
                result = "OK (fulfilled)";
                break;
            case 401:
                result = "unauthorized";
                break;
            case 403:
                result = "forbidden";
                break;
            case 404:
                result = "not found";
                break;
            case 500:
                result = "server error";
                break;
            default:
                result = "not supported status code";

        }
        System.out.println(result);
    }
}
