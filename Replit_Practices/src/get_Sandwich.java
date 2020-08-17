import java.util.Scanner;

public class get_Sandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if (str.contains("bread")){
            int firstIndex = str.indexOf("bread");
            int lastIndex = str.lastIndexOf("bread");

            if(firstIndex == lastIndex){
                System.out.println("nothing");
            }else{
                System.out.println(str.substring(firstIndex+5, lastIndex));
            }
        }else{
            System.out.println("nothing");
        }

        /*
        int firstIndex = str.indexOf("d");
        int lastIndex = str.lastIndexOf("b");

        int count =0;
        for (int i = 0; i <=str.length()-5 ; i++) {
            String fiveLetters = str.substring(i, i+5);
            if(fiveLetters.equalsIgnoreCase("bread")){
                count++;
            }
        }
        if(count<2){
            System.out.println("nothing");
        }else{
            System.out.println(str.substring(firstIndex+1, lastIndex ));
        }

         */


    }
}
