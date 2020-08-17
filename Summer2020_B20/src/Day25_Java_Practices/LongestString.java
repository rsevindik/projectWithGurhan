package Day25_Java_Practices;

public class LongestString {
    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};

        int maxLength = arr[0].length();

        for (String each : arr) {   // to find the maxLength
            if (each.length() > maxLength) {
                maxLength = each.length();
            }
        }

        System.out.println(maxLength);
            int count=0;
        for (String each : arr) { // in this loop we will find out how many strings are there in the array with the longest length
            if (each.length() == maxLength) {
                System.out.println(each);
                count++;
            }
        }
        System.out.println(count); // how many longest words

    }

}
