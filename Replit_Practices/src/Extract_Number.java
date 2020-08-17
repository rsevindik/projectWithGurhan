import java.util.Arrays;

public class Extract_Number {


    public static void main(String[] args) {

    String s = "aa!!%$#.10aa";

    String [] sChars = s.split((""));

        System.out.println(extractNum(Arrays.toString(sChars)));

    }




    public static String extractNum(String s) {
        String str = "aa!!%$#.10aa";
        String [] sChars = str.split("");

        String result = " ";


        for (int i = 0; i <sChars.length-1 ; i++) {



            if(i == '0' || i == '1'||i == '2' || i == '3'||i == '4' || i == '5'||i == '6' ||
                    i == '7'||i == '8' || i == '9'){
                result += i;

            }

        }

            return result;
    }


}






