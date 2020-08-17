import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Print03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++){
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 6 items
        //and print three neighboring items at a time till last item
        //write your code below

        int i = 0;
        while(i<=arr.length-1){
            System.out.println(arr[i]+", "+arr[i+1]+", "+arr[i+2]);
            i++;
            if(i+2>arr.length-1){
                break;
            }

        }

    }
}






