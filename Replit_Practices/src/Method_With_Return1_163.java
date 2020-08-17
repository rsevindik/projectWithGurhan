public class Method_With_Return1_163 {

    public static void main(String[] args) {

        String[] strArray = {"a", "foo", "bar", "foo", "bla"};


        System.out.println(count_appearance(strArray, "FOO"));

    }


    public static int count_appearance(String[] arr, String t) {

        String[] strArray = {"a", "foo", "bar", "foo", "bla"};
        String str = "foo";
        int count = 0;
        for (String each : strArray) {
            if (each.equalsIgnoreCase("foo")) {
                count++;


            }
        }
        return count;
    } //end  count_appearance

}