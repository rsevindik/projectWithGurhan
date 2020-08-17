public class MethodsWString13_FindErrorString {
    public static void main(String[] args) {

        System.out.println(appearsTwice("java", "java is fun!"));

    }
    public static boolean isError (String line){

        boolean result = line.startsWith("error");

        return result;

    }
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:

        String [] words = sentence.split("");
       boolean result = true;
        for ( String each  : words ) {
            int count = 0;
            for (String word  : words ) {
                if(each.equals(word)){
                    count++;
                }
                if(count ==2){
                    result = true;
                }else{
                    result = false;
                }

            }
        }
        return result;
    }
}
