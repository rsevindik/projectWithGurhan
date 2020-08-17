public class Assessment_Test3_ReverseAnArray {
    public static void main(String[] args) {
        String [] arr = {"apple", "pear"};

        System.out.println(reverse(arr));

    }

    public static String[] reverse(String[] arr) {
        String [] reversedArr = new String [arr.length];
        int index = 0;
        for (int i = arr.length-1; i>=0 ; i--) {
            reversedArr[index] = arr[i];
            index++;
        }


        return reversedArr;

    }

}

