package Day24_Arrays;
/*
    int numbers2 [] = {1,5,8,10,35};
        double sum= 0;
        for (int j = 0; j <= numbers2.length-1 ; j++) {
             sum += numbers2[j];
        }
        System.out.println("average is: "+sum/numbers2.length);
 */
public class Average {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;

        for (int i = arr.length-1; i >= 0 ; i--) {
            sum += arr[i];

        }

        System.out.println("sum :"+sum);
        double average = sum/ (double) arr.length;  // (double) casting will provide actual result that
                                                    // you can assign it to the double variable
        System.out.println("Average number: "+average);

    }
}
