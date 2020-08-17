import java.util.Scanner;

public class Arrays_CountEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below

        String evenNums = "";  // only counting the evens not their value.!
        int countEvens = 0;

        String evenOdds = "";  // only counting the evens not their value.!
        int countOdds = 0;

        for(int each : nums){
           if(each%2 ==0){
             countEvens +=1;
               evenNums += each+"";  //add the even num but do not do any operations (Turn it to string)
            }else{
               countOdds +=1;
               evenOdds += each+"";
           }
        }
        System.out.println(countEvens);
    }
}
