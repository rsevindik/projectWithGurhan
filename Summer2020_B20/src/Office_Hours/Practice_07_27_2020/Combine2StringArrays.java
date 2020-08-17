package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class Combine2StringArrays {
    public static void main(String[] args) {

        char[] a1 = {'A', 'B', 'C', 'D'};
        char[] a2 = {'D', 'E', 'F'};

        char [] a3 = new char [a1.length + a2.length];


        for (int i = 0; i <= a1.length-1 ; i++) {
            a3[i] = a1[i];

        }
        for (int j = 0; j <= a2.length-1 ; j++){
            a3[j+a1.length] = a2[j];

        }

        System.out.println(Arrays.toString(a3));
    }
}
