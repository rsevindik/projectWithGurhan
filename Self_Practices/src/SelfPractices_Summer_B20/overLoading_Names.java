package SelfPractices_Summer_B20;
/*
==> Having multiple methods with the same name but different parameters.

        ==> return type can be same or different

        ==> Method overloding improves the reusability and readability

        ==> it is easy to remember one method name instead of a lot of different names.

 */
public class overLoading_Names {

    public static void main(String[] args) {

    //    sayHello();               // Hello
    //    sayHello("friends");      // Hello friends
    //    sayHello(2020);           // Hello 2020

        String sayHi = hi("ahmet", "Zehra");	// two ways to call it
        System.out.println(sayHi);

       String s = hi("Meryem","Hasan");	// Hello Meryem,Hello Hasan
       System.out.println(s);

       System.out.println(hi("Meryem", "Hasan"));


int year = hi(2020);
        System.out.println(year);
    }

    public static void hi(){
        System.out.println("Hello");
    }

    public static void hi(String word){
        System.out.println("Hello " + word);
    }

    public static int hi(int num){
        return num ;

    }

    public static String hi(String str1, String str2){

        return "Hello " + str1 + ", Hello " + str2;

    }
}
