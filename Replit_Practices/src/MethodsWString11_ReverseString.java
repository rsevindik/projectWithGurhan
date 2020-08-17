public class MethodsWString11_ReverseString {
    public static void main(String[] args) {

        System.out.println(reverse("Ramazan"));
    }
    public static String reverse(String input) {
        String reversed = "";
        char [] ch = input.toCharArray();

        for (int i = ch.length-1; i >=0 ; i--) {
            reversed += ch[i];
        }
return reversed;
    }
}
