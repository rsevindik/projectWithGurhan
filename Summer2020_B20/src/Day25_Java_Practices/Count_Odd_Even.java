package Day25_Java_Practices;

public class Count_Odd_Even {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int countEven = 0;
        int countOdd = 0;

        String even = "";
        String odd = "";

        for (int each : nums) {
            if (each % 2 == 0) {
                countEven += 1;
                even += each + " "; // just to print all the evens=
            } else {
                countOdd++;
                odd += each + " ";
            }
        }
    /*
           if (each % 2 != 0) {
                countOdd += 1;
                odd += each + " ";
             }
             -------OR---------
             if(each %2 ==0){
               countEven += 1;
               even += each+" ";
               continue;
           }
           countOdd++;
           odd += each+" ";
    */
            System.out.println("Even Numbers: " + even);
            System.out.println("total Even numbers: " + countEven);
            System.out.println("Odd Numbers: " + odd);
            System.out.println("total Odd numbers: " + countOdd);
        }
    }

