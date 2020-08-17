package Day29_Custom_Methods;

public class Reversed_String {
    public static void main(String[] args) {
        reverse("ramazan");
        reverse("sevindik");

    }

    public static void reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {

        result += str.charAt(i);

        }
        System.out.println(result);

    }

}
