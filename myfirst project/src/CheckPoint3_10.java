public class CheckPoint3_10 {
    public static void main(String[] args) {

        double sales = 75000.0;
        double commission;

        if (sales >= 50000){
            commission = 0.2;
        }else{
            commission = 0.1;
        }

        System.out.println(commission);

    }
}
