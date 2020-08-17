package Day28_Recaps;

public class Loop_ShortQuiz {
    public static void main(String[] args) {
        int a =0;

        while(a <= 6){
            a+=2;

        }
        System.out.println(a);
        System.out.println("======================");

        int i = 0;
        int j = 7;

        for ( i = 0; i <j-1 ; i+=2) {   //i: 0 2 4 6
            System.out.println(i+" ");  // 0 2 4
        }
        System.out.println();
        System.out.println(i);

        System.out.println("==========================");

        for (int k = 0; k <=4 ; ) {
                 k++; // value of k after execution: 1 2 3 4 5

            System.out.println(k+""); // 1 2 3 4
                // k++;  // then execution will start from 0 till 4 ..!

            System.out.println("==========================");

            int z= 5;  // 5+5+5+4+3+2+1
            for (int l = 5; l >0 ; l--) {   //l:5 4 3 2 1
                z+=l;
            }

        }
    }
}
