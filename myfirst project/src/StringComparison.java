public class StringComparison {
    public static void main(String[] args) {

        String name1 = "Mark";
        String name2 = "Mary";

        if (name1.equals(name2))   /** (name 1 == name2) is okay but for String (text which is not a primitive data)
                                   use (name1 .equals(name2)) */
            System.out.println("Names are the same!");

        else
            System.out.println("Names are NOT the same.!");
    }
}
