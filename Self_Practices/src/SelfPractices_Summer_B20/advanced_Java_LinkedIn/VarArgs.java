package SelfPractices_Summer_B20.advanced_Java_LinkedIn;

public class VarArgs {
    public static void main(String[] args) {

        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        String [] shopping = {"Bread", "Milk", "Eggs", "Bananas"};

        printShoppingList(item1, item2);
        printShoppingList(item1, item2, item3);
        printShoppingList(shopping);

    }

    private static void printShoppingList(String string1, String string2) {
        System.out.print("Shopping List: "+string1+", "+string2);
        System.out.println();
    }

    private static void printShoppingList(String string1, String string2, String string3) {
        System.out.print("Shopping List: "+string1+" "+string2+" "+string3);
        System.out.println();
    }
    /*private static void printShoppingList(String [] items) {//this method is the same as following (VarArgs) methods.!!!!
        System.out.println("Shopping List: ");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + " - " + items[i]);
        }
    }*/
    private static void printShoppingList(String ... items) { // this makes the coding easier and simpler
        System.out.println("Shopping List: ");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + " - " + items[i]);
        }
    }

}
