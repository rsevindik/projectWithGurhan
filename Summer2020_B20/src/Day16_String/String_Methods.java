package Day16_String;

public class String_Methods {

    public static void main(String[] args) {
/*
        String email = "cybertek@gmail.com";
        email = email.replace("gmail", "yahoo"); //"cybertek@yahoo.com"
        System.out.println(email);

        String word = "java";

        word = word.replace("a", "e");

        System.out.println(word);

        String sentence = "I like to lear java, java is cool, java is fun";
        sentence =

                // replace:
                String email = "cybertek@gmail.com";

        email = email.replace("gmail", "yahoo"); // "cybertek@yahoo.com"

        System.out.println(email);


        String word = "java";
        word =   word.replace("a", "e");  // "jeve"

        System.out.println(word);

        String sentence = "I like to lear Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java" , "a, C#");

        sentence = sentence.replace("Java ", "Python ");

        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is nice place";  //MIT

        s1 = s1.replace("Cybertek", "MIT");

        System.out.println(s1);

        s1 = s1.replace("MIT", "Cybertek");

        System.out.println(s1);

        String s2 = "I like to leaRn Java, we aRe enjoying Java"; //r

        s2 = s2.replace("R", "r");  // "I like to learn Java"

        System.out.println(s2);
        */

//replaceFirst:

        String s3 = "I like to drink tea and tea";

        s3 = s3.replaceFirst("tea", "cola");  // only the first one will be replaced.!
        System.out.println(s3);

        String s4 = "I like to watch Game of thrones, and Walking dead";

        s4 = s4.replace(", and Walking dead", ".");

        System.out.println(s4);

        // indexOf();
        String s5 = "I like to stay in cybertek, we are learning java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re"); // only look for the fist char but the second char will help for specifying exact ch
        int r3 = s5.indexOf("rn"); // same here

        System.out.println(r1);
        System.out.println(s5.charAt(r1));
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(s5.charAt(38));

        //LastIndexOf();
        String s6 = "Java is a programing Language, and Java is fun";

        int I1 = s6.indexOf("J");      // first "J"
        int I2 = s6.lastIndexOf("J"); // last "J"


        System.out.println(I1);
        System.out.println(I2);

        String s7 = "Java";
        int a1 = s7.indexOf("A"); // will return (-1) because it does not exist in our text.!

        System.out.println(a1);

        String s8 = "Java";
        int a = s8.indexOf("a"); //
        char ch = s8.charAt(a);

        System.out.println(ch);
        System.out.println(a);




    }
}
