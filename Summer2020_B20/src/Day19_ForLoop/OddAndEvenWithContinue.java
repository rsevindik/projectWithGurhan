package Day19_ForLoop;

public class OddAndEvenWithContinue {

    public static void main(String[] args) {

        for (int i = 1; i <=50 ; i++) {

            if(i%2 !=0){
                continue;   //skipping odd numbers will create even number sequences
            }
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i <=50 ; i++) {

            if(i%2 ==0){
                continue;  //skipping even numbers will create odd number sequences
            }
            System.out.print(i+" ");
        }
    }


}
