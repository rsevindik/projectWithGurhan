package day03_Sequences_Variable;

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Hello Everyone,\n\tMy name is Cybertek\n"); // Java is not space sensitive
        System.out.println("\t\tI'm from Indiana\n\n"); // leaving space (like tab key) in front
        System.out.println("\t\t\tI love programing w/chocolate.!");
        
      /*
        System.out.println("\\");      // prints one back slash
        System.out.println("/");       // will print one front slash
        System.out.println("\\\\");    // will print only double back slashes
        System.out.println("//");      // will print double front slashes
       */      // minimizing your commend(note) which will not cause any distraction an/or confusions

        System.out.println("\\\'");    // "\" will be used for each escape sequence !!

        System.out.println("Author Said; \"My name is; \'Ra-ma-zan\'\n(and I'm belonged to Sevindik\'s Family.!)\"");

        System.out.println("\nMy favorite TV-series: \"Sirlar Dunyasi.\"");

        System.out.println("Hi Everyone, \n\tMy name is \'Ramazan\'. \n\tI like the movie serious called \"Friends\" " +
                          "\n\tand the book that I currently read is \"Strength\".!");
    }
}
