package Day25_Java_Practices;

public class Shortest_Stirng2 {

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Tony", "Adam", "Musa", "Alan"};

        int minLength = arr[0].length(); // you cannot assign string to int but length of it will be

        for (String each : arr) {   // convertion of for each loop (again finding the shortest length.!
             // we called all the string from the array [i] then evaluate length of each.!

            if (each.length() < minLength) {
                minLength = each.length();
            }
        }

        System.out.println(minLength);

        for (String each : arr) { // in this loop we will find out how many strings are there in converted into for each
            // the array with the shortest length
            if (each.length() == minLength) {
                System.out.println(each);
            }
        }
    }
    }
