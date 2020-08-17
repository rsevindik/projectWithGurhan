package Day19_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            if(i == 3){
                continue;  // skip 3 then continue (only in the loop)
            }
            System.out.print(i+" ");

            System.out.println();
        }
        System.out.println("==================");

        for(char ch = 'A'; ch <= 'F'; ch++){
            if(ch == 'C'){
                continue;
            }
            System.out.println(ch+"");
        }
        System.out.println("==================");

        for(char ch = 'A'; ch <= 'F'; ch++) {
            if (ch == 'C' || ch == 'F') {        // you will skipp 2 letters but one at a time therefore || not &&.!
                continue;
            }
            System.out.print(ch + "");
        }
    }
}

