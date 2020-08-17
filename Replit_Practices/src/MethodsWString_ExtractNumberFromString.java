public class MethodsWString_ExtractNumberFromString {
    public static void main(String[] args) {

        System.out.println(extractNum("aa2aa3"));
    }

    public static String extractNum(String s) {

        char [] ch = s.toCharArray();
        String extractNums = "";
        for( Character each  : ch){
            if(Character.isDigit(each)){
                extractNums += ""+each;
            }
        }

return extractNums;
    }
}
