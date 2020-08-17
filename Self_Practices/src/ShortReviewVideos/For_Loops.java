package ShortReviewVideos;

public class For_Loops {
    public static void main(String[] args) {
/*
        for (int n = 1; n <=5 ; n++){

            System.out.println("Hello Guys!");
            System.out.println(n);  // print loop variables (only the numbers: times)
        }
        System.out.println("===========================");

            int m;
        for(m = 1; m <= 10; m+=3 ){
            System.out.println(m);
        }
        // System.out.println(n);  again this will give a compile error since its out of ForLoop body{}
        // we can solve this problem but if there is only a reason for that otherwise it's not necessary.!
        // declare int m; above the for loop then you will be able to print variable at the end and out of forLoop body

        System.out.println(m);  // will give 13 at the end due to m+=3. yu increase the value by 3.!

 */
        for(int x=10; x>=0 ; x--){
            System.out.print(x+"- ");
        }

        /*
         * Write a program to calculate sum of all numbers
         * between 1-5
         * 1,2,3,4,5 -> 15
         */

        //System.out.println((1+2+3+4+5));

        int sum = 0;
        for(int i = 1; i<=5; i++) {
            sum=sum+i;
        }
        System.out.println("=======================");

        for (int i = 0; i < 50; i++) {
            if(i%2 !=0) {
                System.out.println(i);
            }

            System.out.println("============================");

            String[] fruits = new String [3];     //array.!!! stay tuned
            fruits[0] = "apples";
            fruits[1] = "pears";
            fruits[2] = "oranges";

            for (int j = 0; j <3 ; j++) {
                System.out.println(fruits[j]);
            }
        }
    }
}

