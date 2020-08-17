package Office_Hours.Practice_6_17_2020;

public class Post_VS_Pre {
    public static void main(String[] args) {

        int a = 300;
        System.out.println(++a); // a = 301
        System.out.println(++a); // a = 302

        int b = 50;
        System.out.println(-- b); // b = 49
        System.out.println(-- b); // b = 48

        int x = 40;
        System.out.println(x --); // 40 (but 39 will be stored in the memory)
        System.out.println(x); // x = 39
        System.out.println(x --); // x = 39 (but 38 will be stored in the memory)
        System.out.println(x); // x = 38

        int y = 60;
        System.out.println(y ++); // 60
        System.out.println(y);  // 61
        System.out.println(y ++); // 61
        System.out.println(y);  // 62
    }

}
