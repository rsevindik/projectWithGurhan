import java.util.Scanner;

public class arrays_Count_Evens_116 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();
        }
        // above code will ask user 10 numbers while creating an array
        // just assume that you have int array with 10 numbers and start working on requirement
        // loop through the array and get the count of the even numbers
        //TODO: Write your code below
        int countEvens = 0;

        for(int each : nums) {
            if (each % 2 == 0) {
                countEvens += 1;

            }
        }

        System.out.println(countEvens);

    }
}
