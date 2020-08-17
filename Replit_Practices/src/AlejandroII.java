import java.util.Scanner;

public class AlejandroII {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        boolean isProject = a.contains("project") || a.contains("Project")||a.contains("PROJECT");

        if( isProject){
            System.out.println("read this email");
        }else{
            System.out.println("don't read");
        }
    }
}
