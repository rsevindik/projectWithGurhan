package Day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass_Practice {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

        Integer [] arr2 = {1,2,3,4};
        for(Integer each : arr2){
            System.out.println(each+1);
        }

        double [] arr3 = {1,2,3,4,5,6,7}; // implicitly accepts int
        Double [] arr4 = {1.0,2.0,3.0,4.0,5.0,6.0,7.0};  //only accepts decimal variable

        for(Double each : arr4) {  // to eliminate any box-unboxing processes assigning Wrapper class is better.!!
            System.out.println(each);
        }

        char [] arr5 = {65,67,68,69};
        System.out.println(Arrays.toString(arr5));   // returns char values

        char ch = 80;
        Character ch2 = ch;  //auto-boxing
        System.out.println(ch2);

        String [] nums1 = {"12","13","14","15"};
        double [] nums2 = new double [nums1.length];

        for (int i = 0; i <=nums1.length-1 ; i++) {
            nums2[i] = Double.parseDouble(nums1[i]);
        }

        System.out.println( Arrays.toString(nums2)  );

    }
}
