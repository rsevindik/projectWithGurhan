import java.util.Scanner;

public class prefix_Again_99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();


            String prefix = str.substring(0,n);
            String remaining = str.substring(n);

                String result = (remaining.contains(prefix))? "true" : "false";

        System.out.println(result);
            }
        }


