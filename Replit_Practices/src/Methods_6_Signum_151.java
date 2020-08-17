import java.util.Scanner;

public class Methods_6_Signum_151 {

    public static void sign(int n)
    {
        //your code here
    int result =0;
    if(n>0){
    result = +1;
    }else if(n<0){
        result=-1;
    }else{
        result = 0;
    }
        System.out.println(result);
    }//end sign

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }

}
