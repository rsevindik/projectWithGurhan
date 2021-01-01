package SelfPractices_Summer_B20.Interview_Questions.ready_for_sublime.done;

import java.util.Arrays;

public class ReversedINTArray {
        public static void main(String... args) {
            int[] array = {2, 3, 45, 2, 1, 4, 5, 3};
            System.out.println("array is: " + Arrays.toString(array));
            reverse(array);
            System.out.println("reverse array is: " + Arrays.toString(array));
        }
        static void reverse(int[] array) {
            int maxIndex = array.length - 1;
            int halflength = array.length / 2;
            for (int i = 0; i < halflength; i++) {
                int temp = array[i];
                array[i] = array[maxIndex - i];
                array[maxIndex - i] = temp;
            }
        }
}
