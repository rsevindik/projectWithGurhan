package Day28_Recaps;

import java.util.Arrays;

public class ArraysShortQuiz {
    public static void main(String[] args) {

        char [] arr = {'D','C','B', 'A'};
        Arrays.sort(arr);

        for( char each : arr){
            //System.out.println(each); // will print A B C D

            if(each == 'D'){
                continue;
            }
            System.out.println(each); // if you move the print statement here then it will only print A B C
        }
        System.out.println();
        System.out.println("==========================");

        String [] days = {"sun", "mon","wed","sat"};
        for (int i = 0; i < days.length ; i++) {

            //switch

            System.out.println("=====================");

            int [] nums = {15,30,45,60,75};

            nums[2] = nums[4]; // {15,30,75,60,75}

            nums[4] = 90; //{15,30,75,60,90}

            System.out.println(Arrays.toString(nums));

            System.out.println("====================");

            int [] a = {1,2,3,4};
            int y = 0;
            do{
                System.out.println(a[y]); // 1 2 3
                y++;   // y: 1 2
            }while(y<a.length-1);
            //    y<3






        }


    }
}
