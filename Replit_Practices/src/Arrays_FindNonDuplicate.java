import java.util.Scanner;

public class Arrays_FindNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below

        for (int x : nums) {
            int count = 0;
            for (int each : nums) {
                if (each == x) {
                    count++;

                }
            }
            if (count == 1) {
                System.out.println(x);
            }
        }

    }
}