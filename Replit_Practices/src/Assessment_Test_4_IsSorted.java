public class Assessment_Test_4_IsSorted {

    public static void main(String[] args) {

        int numbers [] = {2,3,5,4,9};
        System.out.println(isSort( numbers));

    }

    public static boolean isSort(int[] nums){
        int numbers [] = {2,3,5,4,9};

        boolean result = true;
        for(int each   : numbers){
            for (int i = 0; i <=numbers.length-1 ; i++) {
                if( each > numbers[i++]){
                    result = false;
                }else{
                    result = true;
                }
            }
        }


           return result;
        }



    }

