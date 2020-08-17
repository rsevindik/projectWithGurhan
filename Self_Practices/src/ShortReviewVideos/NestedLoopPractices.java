package ShortReviewVideos;

public class NestedLoopPractices {
    //for in for
    public static void main(String[] args) {
        for (int i = 1; i <= 4 ; i++) {
            System.out.println();
            for (int j = 1; j <= 3 ; j++) {
                System.out.print("|row"+i+"-column"+j);
        }
    }
        System.out.println();
        System.out.println("====================");
    // for each in for each loop
        int [] cols ={1,2,3};
        int [] rows= {1,2,3,4};

        for (int row : rows) {
            System.out.println();
            for (int column : cols) {
                System.out.print("|row" + row+"-column" + column);
            }
        }
        System.out.println();
        System.out.println("===================");
        // while in while loop
        int row = 0;
        while(row<4){
            row++;
            System.out.println();

            int col =0;
            while(col < 3){
                col++;
                System.out.print(" |Row " +row+" -Column"+col);
            }
        }
    }
}
