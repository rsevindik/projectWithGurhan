package Office_Hours.Practice_07_20_2020;

public class Max_2DArray {

    public static void main(String[] args) {
        int [][] arr2D = {{1,2,3} , {4,5,6,7}  , {8,9,10,11,12}};

        int max = arr2D[0][0];

        for (int j = 0; j <= arr2D.length-1 ; j++) {// j: index numbers of arrays
            int [] eachArr1 = arr2D[j];     // i: index numbers of elements
            for (int i = 0; i <=eachArr1.length-1 ; i++) {
                int eachNum =  eachArr1[i];
                if (eachNum > max){
                    max = eachNum;
                }
            }
        }

        /*
        int [] eachArr1 = arr2D[0];
        for (int i = 0; i <=eachArr1.length-1 ; i++) {
           int eachNum =  eachArr1[i];
           if (eachNum > max){
               max = eachNum;
           }
        }

        int [] eachArr2 = arr2D[1];
        for (int i = 0; i <=eachArr2.length-1 ; i++) {
            int eachNum =  eachArr2[i];
            if (eachNum > max){
                max = eachNum;
            }
        }

        int [] eachArr3 = arr2D[2];
        for (int i = 0; i <=eachArr3.length-1 ; i++) {
            int eachNum =  eachArr3[i];
            if (eachNum > max){
                max = eachNum;
            }
        }

         */


        System.out.println(max);



    }
}
