package Day30_Custom_Method;

public class ReturnMethods {
    public static void main(String[] args) {

        addition1(3,4); // this value is not reusable.!

        int sum = addition2(10,20); // this value is reusable and can be assigned to a variable
        System.out.println(sum);

        System.out.println(addition2(3,4)*2);
     //   System.out.println(addition1(3,4)*2);


    }
    public static void addition1(int a, int b){   // this method(void) only can be printed
        int sum = a+b;
        System.out.println(sum);
    }

    public static int addition2(int a, int b){   // this method(void) only can be printed
        int sum = a+b;
        return sum;
    }



}
