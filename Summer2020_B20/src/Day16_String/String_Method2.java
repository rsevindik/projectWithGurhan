package Day16_String;

public class String_Method2 {
    public static void main(String[] args) {

        // isEmpty():
        String name = "Cybertek";
        System.out.println(  name.isEmpty() );

        String name5 = "";
        System.out.println(name5.isEmpty());

        String name1 = "Java"; // in the pool as a literal
        String name2 = new String("Java"); // heap

        System.out.println(name1+" : "+name2);
        System.out.println(name1 == name2);  // false due to referring different objects one created in pool the other in heap

        System.out.println(name1.equals(name2)); // true because as texture they are the same (look the same.!)
                                        // that's why for the string when we compare them we must always use .equals();

        String str3 = new String("Java"); // for the same object there will be 2 different creations in heap
        String str4 = new String("Java"); // therefore they are not the same (false)

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        String str5 = "Java";
        String str6 = "java";

        System.out.println(str5 == str6);   // true
        System.out.println(str5.equals(str6)); // true

        String str7 = "JAVA";
        String str8 = "java";

        System.out.println(str7.equals(str8)); // false
        System.out.println(str7.equalsIgnoreCase(str8)); // true

        //contains:

        String str = "I like to learn java programing language";

        System.out.println(str.contains("python")); // false
        System.out.println(!str.contains("python")); // true

        // startsWith();
        String s1 = "Muhtar";
        System.out.println(s1.startsWith("M")); // true
        System.out.println(s1.startsWith("J")); // false

        System.out.println(s1.endsWith("r")); // true

        System.out.println(s1.toLowerCase().contains("mu")); // true
        //             "muhtar".contains("mu");


        // endsWith(str);


    }
}
