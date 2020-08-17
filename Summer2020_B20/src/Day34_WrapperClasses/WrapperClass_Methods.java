package Day34_WrapperClasses;

public class WrapperClass_Methods {
    public static void main(String[] args) {

        String str = "123";

        int a = Integer.parseInt(str); //converts str to primitive(with Parse method)

        System.out.println(str+1); //1231  (String)
        System.out.println(a+1);   //124    (integer)

        double d1 = Double.parseDouble("7.5");
        System.out.println(d1-1); // integer value

        float f1 = Float.parseFloat("5.5");
        System.out.println(f1+1);

        String s1 = "TRUE";

        boolean b1 = Boolean.parseBoolean(s1);

        System.out.println(!b1);

        System.out.println("===========================================");


        String s2 = "10000.5"; // *2
        double d2 = Double.valueOf(s2); // unboxing (since it will be done implicitly: this is redundant)

        System.out.println(d2*2);


        String s3 = "FaLSe";  //????? is this a primitive such as boolean???
        boolean r2 = Boolean.valueOf(s3); // unboxing

        System.out.println(r2);

        /**
        byte b = 30;
        Byte b2 = Byte.valueOf(b);  // unnecessary since it's done by implicitly (NEED more practice.!)
        */


    }
}
