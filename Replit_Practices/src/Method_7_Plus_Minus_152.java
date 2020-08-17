import java.util.Scanner;

public class Method_7_Plus_Minus_152 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main


    public static void plus_minus(int [] arr){
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        for(int each : arr){
            if (each>0){
                countPositive++;
            }else if(each <0){
                countNegative++;
            }else{
                countZero++;
            }

        }
        System.out.println(" positives: "+countPositive+" negatives: "+countNegative+" zeros: "+ countZero);
    }

}