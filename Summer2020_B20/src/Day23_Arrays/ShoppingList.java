package Day23_Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        String [] shoppingList = new String [7];

        shoppingList [0] = "Toilet Paper";
        shoppingList [1] = "Hand Sanitizer";
        shoppingList [4] = "Egg";
        shoppingList [6] = "Bread";
        shoppingList [2] = "Milk";
        shoppingList [3] = "Watermelon";
        shoppingList [5] = "Water";

        for (int i = 0; i <=shoppingList.length-1 ; i++) {
            System.out.println(shoppingList[i]);
        }
    }
}
