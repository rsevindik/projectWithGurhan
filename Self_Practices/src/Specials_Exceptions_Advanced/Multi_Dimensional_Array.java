package Specials_Exceptions_Advanced;
import java.util.Arrays;
import java.util.Scanner;
public class Multi_Dimensional_Array {
    public static void main(String[] args) {


                int a[] = {1,2,3,4};
                System.out.println(Arrays.toString(a));
                int b[] = {5,6,7};
                System.out.println(b);
                System.out.println(Arrays.toString(b));
                //int c[][] = {{1,2,3,4}, {5,6,7}};
                int c[][] = {a,b};
                System.out.println(Arrays.toString(c));//It does not work for writing a dimensional arrays!!!!
                System.out.print(Arrays.deepToString(c));//"Arrays.deepToString()" method can be just used for multi-D arrays!!!
                //It turns the multi-D array into String!!!!
                System.out.println("\n==========================================");
                for (int i = 0;i < c.length;i++){
                    System.out.print(Arrays.toString(c[i]));//We can write in console each ARRAY in the multi dimensional array!!!
                }
                System.out.println("\n==========================================");
                Scanner scan = new Scanner(System.in);
                for (int i = 0;i < c.length;i++){
                    for (int k = 0;k < c[i].length;k++){
                        c[i][k] = scan.nextInt();
                        System.out.print(c[i][k] + " ");
                    }
                }
                System.out.println("\n==========================================");
                //If we want to assign characters to multi dimensional array we can use nested loops!!!!
                int num = 10;
                for (int i = 0;i < c.length;i++){
                    for (int k = 0;k < c[i].length;k++){
                        c[i][k] = num;
                        num--;
                    }
                }
                for (int i = 0;i < c.length;i++){
                    System.out.print(Arrays.toString(c[i]));
                }
                System.out.println("\n==========================================");
                for (int i = 0;i < c.length;i++){
                    for (int k = 0;k < c[i].length;k++){
                        System.out.print(c[i][k] + " ");
                    }
                }
                System.out.println("\n==========================================");
                //3 dimensional array (arr3)!!!!!
                int arr1[][] = {{1,2,3},{3,4},{4,5,6,7,8}};
                int arr2[][] = {{5,6,7,8},{9,10}};
                int arr3[][][] = {arr1, arr2};
                System.out.println(Arrays.deepToString(arr3));

        System.out.println("==============================================");


            }
        }

