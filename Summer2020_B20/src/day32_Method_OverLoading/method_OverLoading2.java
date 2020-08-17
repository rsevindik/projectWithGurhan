package day32_Method_OverLoading;

public class method_OverLoading2 {

    public static void main(String[] args) {
        addition2Numbers(10,20);
        addition3Number(10,30,40);
        addition4Number(10,46,57,44);

        System.out.println("===========================");

        addition(12,34);
        addition(12,45,67,78);



    }/** end of the main method  */

    public static void addition2Numbers(double a, double b){

        System.out.println(a+b);

    }
    public static void addition3Number (double a, double b, double c){

    }
    public static void addition4Number (double a, double b, double c, double d){

    }
//=======================================================

    public static void addition(double a, double b){
        System.out.println(a+b);
    }
    public static void addition(double a, double b, double c){
        System.out.println(a+b+c);
    }
    public static void addition(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }




}/** end of class */
