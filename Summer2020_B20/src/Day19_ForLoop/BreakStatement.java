package Day19_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            System.out.println("Hello");
            break;      // once will be printed.!
        }
        System.out.println("================");

        for (char ch = 'A'; ch <= 'H'; ch++) {

            if (ch == 'C') {
                break; // since it comes before the print statement, end result will be A and B
            }
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("================");

        for (char ch = 'A'; ch <= 'H'; ch++) {

            System.out.println(ch + " ");// since it comes before the break statement and java reads from top to bottom,
                                        // the end result will be A, B and C (First executes then get break.!!
            if (ch == 'C') {
                break;
            }
        }
        System.out.println("================");

        for (int i = 10; i <= 50; i += 10) {
            System.out.print(i+" ");
            if(i==30){
                break;
            }
        }
        System.out.println();
        System.out.println("================");

        for (int x = 1000; x >= 100 ; x-=100) {
            if(x == 500){
                break;
            }
            System.out.print(x+" ");
        }
    }
}
