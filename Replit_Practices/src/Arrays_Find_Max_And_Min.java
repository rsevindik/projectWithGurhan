import java.util.Scanner;

public class Arrays_Find_Max_And_Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // yes above code will ask user 5 numbers while creating an array
        // just assume that you have int array with 5 numbers and start working on requirement
        // loop through the array and find the max number.

        //TODO: Write your code below .

        int max = 0;
        int min = 0;
        for (int i = 0; i <= 4 ; i++) {
            int num = nums[i];
            max = nums[0];
            min = nums[0];
            if(num > max){
                max=num;
            }
            if(num < min){
                min=num;
            }

        }
        System.out.println(max);
        System.out.println(min);




    }
}
