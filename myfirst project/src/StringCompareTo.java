public class StringCompareTo {
    public static void main(String[] args) {

     /*   String name1 = "Mary", name2 = "Mark";

           if(name1.compareTo(name2) < 0)
            System.out.println(name1 + " is less than " + name2);
        else if (name1.compareTo(name2) == 0)
            System.out.println(name1 + " is eqaual to " + name2);
        else if (name1.compareTo(name2) > 0)
            System.out.println(name1 + " is greater than " +name2);
      */
        String name1 = "Mark", name2 = "Mark", name3 = "Mary";

// Compare "Mark" and "Mark"

        if (name1.equals(name2)) {

            System.out.println(name1 + " and " + name2 + " are the same.");
        } else {

            System.out.println(name1 + " and " + name2 + " are NOT the same."); }

            // Compare "Mark" and "Mary"

        if (name1.equals(name3)) {

            System.out.println(name1 + " and " + name3 + " are the same.");
        } else {

            System.out.println(name1 + " and " + name3 + " are NOT the same."); }


    }
}
