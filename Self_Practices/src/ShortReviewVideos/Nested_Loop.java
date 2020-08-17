package ShortReviewVideos;

public class Nested_Loop {
    public static void main(String[] args) {
        /*

        // nested for loop  like rows and columns on excel doc.
        for (int r = 0; r < 2; r++) { // row iteration
            for (int k = 0; k < 3; k++) { // column iteration
                System.out.println("IRow" + r + "-Column" + k + "I ");
            }
            System.out.println();
        }
        // nested for each loop
        int[] rows = {1, 2, 3, 4};
        int[] columns = {1, 2, 3};

        for (int row : rows) {

            for (int col : columns) {
                System.out.println(" IRow" + row + "-Column" + col);
            }
            System.out.println();
        }
        // nested while loop
        int i = 0;
        while (i < 5) {
            i++;
            int j = 0;
            while (j < 3) {
                j++;
                System.out.println(" IRow" + i + "-Column" + j);
            }
            System.out.println();
        }
        // nested do-while loop
        int i1 = 0;
        do {
            i1++;
            int j = 0;
            do {
                j++;
                System.out.println(" IRow" + i1 + "-Column" + j);
            } while (j < 3);
            System.out.println();
        } while (i1 < 5);

        // nested for loop and while loop
        for (int j = 0; j < 4; j++) {
            int k = 0;
            while (k < 3) {
                System.out.println(" IRow" + j + "-Column" + k);
                k++;
            }
            System.out.println();

            for(int m = 0; m <4 ; m++){
                System.out.println();
                for(int n=0; n<3; n++){
                    System.out.print(" |Row"+m+"-Column"+n);
                }
            }
        // for each loop
        int [] cols = {1,2,3};
        int [] rows = {1,2,3,4};

        for(int row : rows){
            System.out.println();

            for(int column : cols){
                System.out.println(" |Row " +row+"-Column "+column);
            }
        }
        // nested while loop
        int row =0;
        while(row<4){
            row++;
            System.out.println();

            int col = 0;
            while(col<3){
                col++;
                System.out.print(" |Row "+row+"-Column "+col);
        }

        }

         */
/*
        String str = "today it will be cybertekthtyjtyjuuklkiili;ulu";
        int n = 0;
        while( n++ < str.length()) {
if(n==8){
    continue;

}else if(n==9){
    break;
}
            System.out.println(str.charAt(++n));

        }
        */
        int count = 0;
        for (int a =0; a < 4; a++) {
            if(a==3) continue;
            for (int b = a+1; b <5; b++) {
               count++;
               if(b==3) break;
            }
        }
        System.out.println(count);


        char [] bool = new char[4];
        }

}


/*
int c = a.charAt(4);
if(c =='a'){
    System.out.println("A");
}else if(c == ' '){
    System.out.println("B");
}else{

}

 */




