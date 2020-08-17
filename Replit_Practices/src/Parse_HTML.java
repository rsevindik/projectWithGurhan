import java.util.Scanner;

public class Parse_HTML {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine().toLowerCase();

            if(html.contains("id=")){
           // String myID = html.substring(html.indexOf("\"")+1,html.lastIndexOf("\""));
            System.out.println(html.substring(html.indexOf("id=\"")+4, html.lastIndexOf("\"")));
        }else{
            System.out.println("Invalid input!");
        }

            /*
            (!html.contains("html"))
             */

    }
}
