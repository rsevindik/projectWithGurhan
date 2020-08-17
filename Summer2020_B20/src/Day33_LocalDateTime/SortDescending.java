package Day33_LocalDateTime;

import java.util.Arrays;

public class SortDescending {

    public static void main(String[] args) {

        int [] arr = {1,4,3,2,5};
       // System.out.println(Arrays.toString(arr));

        int [] arr2 = new int[arr.length];  //{5,4,3,2,1};
/*
        arr2[0] = arr[arr.length-1]; //5
        arr2[1] = arr[3];

 */
        int k=arr.length-1;
        for (int i = 0; i <= arr2.length-1 ; i++) {
            arr2[i] = arr[k];
            k--;
        }

        System.out.println(Arrays.toString(arr2));

        System.out.println("=============================");

        int [] scores = {10,40,30,20,50};

        scores = sortDesc(scores);

        System.out.println(Arrays.toString(scores));

        double [] n1 = {5.5, 6.5, 2.5, 1.5, 0.5};

        n1 = sortDesc(n1);

        System.out.println(Arrays.toString(n1));

    }/** end of the main method   */
public static int [] sortDesc(int [] arr){
    int [] arr2 = new int[arr.length];  //{5,4,3,2,1};

    int k=arr.length-1;
    for (int i = 0; i <= arr2.length-1 ; i++) {
        arr2[i] = arr[k];
        k--;
    }
    return arr2;

}

public static double [] sortDesc(double [] arr){
    double [] arr2 = new double[arr.length];  //{5,4,3,2,1};

    int k=arr.length-1;
    for (int i = 0; i <= arr2.length-1 ; i++) {
        arr2[i] = arr[k];
        k--;
    }
    return arr2;
}

public static String [] sortDesc(String [] arr){
    String [] arr2 = new String[arr.length];  //{5,4,3,2,1};

    int k=arr.length-1;
    for (int i = 0; i <= arr2.length-1 ; i++) {
        arr2[i] = arr[k];
        k--;
    }
    return arr2;
}

public static char [] sortDesc(char [] arr){
        char [] arr2 = new char[arr.length];  //{5,4,3,2,1};

        int k=arr.length-1;
        for (int i = 0; i <= arr2.length-1 ; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }



}/** end of the class  */
