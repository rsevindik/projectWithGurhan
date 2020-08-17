package Office_Hours.Practice_6_30_2020;

public class If_Practices {
    public static void main(String[] args) {
        int num = 305;
        String result= " ";

        if(num%2==0){
            result = num+" is an even number!";  // this is the better way cuz reusable.!!
        }else{
            result = num+" is an odd number!";
        }
        System.out.println(result);    /// don't forget after string result assignment.!!!

        String result2 = (num%2 == 0)? num +" is an even number" : num+" is an odd number";
        System.out.println(result2);


    }
}
