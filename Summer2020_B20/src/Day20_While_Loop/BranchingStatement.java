package Day20_While_Loop;

public class BranchingStatement {
    public static void main(String[] args) {
        char ch = 'A';
        while(ch<= 'E'){
            if(ch == 'C'){
                ch++;     // this is for continue statement which skips everything incl iteration.!
                          // that's why you need to add one more iteration
                continue;
              //break;
            }
            System.out.println(ch);
            ch++;
        }
/*
        if(true){
            System.out.println("Started");
            System.exit(0);
        }
        System.out.println("Done");
*/

        boolean a = true;
        while(a){
            System.out.println("Test started");
            break; // if it was in use, "completed" will be printed.!
            //System.exit(0); // right after exit, therefore no printing afterword.!
        }

        System.out.println("Completed");


    }
}
