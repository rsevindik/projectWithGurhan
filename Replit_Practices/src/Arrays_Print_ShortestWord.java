import java.util.Scanner;

public class Arrays_Print_ShortestWord {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
       // String[] str = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
        String[] str = {"Anam", "Nickolas", "Amir", "Nurmamet", "Tony", "Adam", "Musa", "Alan"};
        int minLength = str[0].length();
        for(String each : str){
            if(each.length() < minLength){
                minLength = each.length();
            }
        }
        for(String each : str){
            if(each.length() == minLength){
                System.out.println(each);
            }
        }
    }
}
