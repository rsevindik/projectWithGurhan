package day38_JavaRecap;
/*
Arrays class:
	Arrays.asList(): takes array of values. returns CollectionType

ArrayList Methods:
		 remove, size, set, get, equals, contains, clear

	Bulk Operations: removeAll(CollectionType): removes All the matching elements
					 addAll(CollectionType): adds multiple elements
					 retainAll(CollectionType): removes all the NOT matching elements (only keeps the matching elements)
					 containAll(CollectionType): checks if the elements are contained

	Predicate: removeIf(Predicate): removes all the elemnts that are matching with condition

Collections Class:
		Collections.sort()
		Collections.swap()
		Collections.frequency()

		Collections.max()
		Collections.min()
		Collections.replaceAll()

&&: both
||: either
p > 89 && p < 80 ==> always gonna be false

p == 80 && p == 90 ==> always gonna be false

Next topic: Custom Class:
				class & object
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Mercedes", "Audi", "Tesla", "Lexus", "Toyota", "Mazda", "Toyota", "Toyota", ""));

        cars.remove(3);   // or go with objet: cars.remove("Tesla");

        cars.removeAll(Arrays.asList("Toyota"));

        cars.removeIf(p-> p.toLowerCase().contains("m"));
        cars.retainAll(Arrays.asList("Lexus"));

        System.out.println(cars);

        System.out.println("=======================================");
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll( Arrays.asList("Eggs", "Milk", "Paper Towels", "Toilet Paper", "Mango", "Orange", "Avocado", "Dragon Fruit")  );
        System.out.println(groceryList);

        // pepsi
        boolean r1 = groceryList.contains("Pepsi");
        System.out.println(r1);

        // Eggs, Milk, Orange, Water
        boolean r2 = groceryList.containsAll( Arrays.asList("Eggs", "Orange", "Milk", "Water") );
        System.out.println(r2);

        System.out.println("Total Number of Items: "+ groceryList.size());

        // set the dragon fruit to apple:
        groceryList.set(groceryList.size()-1 ,  "Apple" );
        groceryList.set( groceryList.indexOf("Paper Towels") ,  "Dish Washer");

        System.out.println(groceryList);

        groceryList.clear();
        System.out.println(groceryList);




        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ali", "veli","Ali","deli"));


            if(list.remove("Ali")){
                list.remove("ramazan");
            }
            System.out.println(list);
        }

        //System.out.println( list.remove(a));

    }

