package Office_Hours.Practice_07_14_2020;

public class Unique_Numbers {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3};

        for(int b : arr){   // b will be each elements one by one in arr

            int count = 0;    // for the frequency of num in the arr
            for (int each : arr) {
                if (each == b) {
                    count++;
                }
            }
                    if (count == 2) {
                        System.out.println(b);

            }
        }

        /* will be the repeated part so we need loop (Outer
        int num = arr[2];
        int count = 0;    // for the frequency of num in the arr
        for (int each : arr) {
            if(each == num){
                count ++;

                if(count == 1){
                    System.out.println(num);
                }

            }

         */

    }
}
