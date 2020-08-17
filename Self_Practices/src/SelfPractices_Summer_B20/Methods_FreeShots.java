package SelfPractices_Summer_B20;

public class Methods_FreeShots {

    /*
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    /**
    myMethod() is the name of the method
    static means that the method belongs to the MyClass class and not an object of the MyClass class. .
    void means that this method does not have a return value.
    */
    /*
    //Parameters and Arguments
    static void myMethod(String fname) {
        System.out.println(fname + " Sevindik");
    }

    public static void main(String[] args) {
        myMethod("Ahmet");
        myMethod("Zehra");
        myMethod("Betul");
    }
     */
//Multiple Parameters
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
}
