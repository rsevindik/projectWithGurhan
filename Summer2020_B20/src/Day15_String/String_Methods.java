package Day15_String;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Cybertek School";
        //charAt(indext#);
        char ch1 = name.charAt(0); // C as the first character that rep by 0 index number
        System.out.println(ch1);

        //length() ==> int total numbers of char in integer value
        int l = name.length();
        System.out.println(l);

        //int lastIndexNumber = name.lastIndexOf(name);

        // last index: length of String - 1
        int lastIndexNumber = name.length() - 1;

        System.out.println( lastIndexNumber );

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        String name1 = "CYBERTEK SCHOOL";
        name1 = name1.toLowerCase();

        System.out.println(name1); // returns to the new string with all lower cases

        String name2 = "ramazan";
        name2 = name2.toUpperCase();

        System.out.println(name2);

        String p = "           Cybertek           School";
        p = p.trim();  //Cybertek School  and this will create a new String without unused spaces(white space)
        System.out.println(p);

        String lastName = "school";
        String firstChar = lastName.substring(0,1); //s
        String remaining = lastName.substring(1);

        lastName = firstChar.toUpperCase() + remaining.toLowerCase();

        System.out.println(firstChar);
        System.out.println(remaining);

        System.out.println(lastName);

        String s = "I like Game Of Thrones";
        String s2 = "I like Java Programing Language";

        String series = s.substring(7);
        String language = s2.substring(7);

        System.out.println(series);
        System.out.println(language);

    }
}
