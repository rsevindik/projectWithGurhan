package Day29_Custom_Methods;

public class PalindromeTest {
   /*
   palindrome : kayak, level, anna
    */
   public static void main(String[] args) {

       palindrome("Cybertek");

   }

    public static void palindrome(String word){
        String reversed = "";
        for (int i = word.length()-1; i >=10 ; i--) {
            reversed += word.charAt(i);
        }
        System.out.println(reversed.equalsIgnoreCase(word));  // result is the boolean (true/False)
    }

}
