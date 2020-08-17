package Day22_NestedLoop;

public class NestedLoop2 {
    public static void main(String[] args) {

        for (int j = 0; j <5 ; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + "");
            }
            System.out.println();
        }
        System.out.println("===================");

        for (int i = 1; i <=10 ; i++) {   //creating lines top to bottom as java works
            for (int j = 1; j <=10 ; j++) { // creates * left to right in each lines as java works
                if(j%2==0){
                    System.out.print(" | ");
                }
                System.out.print(" * ");
            }
            System.out.println();
        }





        }

    }

