package Day15_String;

public class SubString_Method {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        // index numbers = 012345678910
        //substring(beginning index, ending index)
        String word = sentence.substring(0,4);
        String word2 = sentence.substring(8,11);

        System.out.println(word);
        System.out.println(sentence.trim());
        System.out.println(word2);

        String sentence2 = "I like Movies and TV Series";
          // index numbers= 0123456789.......
        String word3 = sentence2.substring(7,13);

        System.out.println(word3);

        String firstName = "Ramazan";
        String firstChar = firstName.substring(0,1);
        String rest = firstName.substring(1,firstName.length()); // first.length() means (lastIndex +1) ***** Practice

        System.out.println(firstChar);
        System.out.println(rest);

        firstName = firstChar.toUpperCase()+rest.toLowerCase();

        System.out.println(firstName);

    }
}
