public class utopianTree {
    public static void main(String[] args) {

        int growth = 0;
        int year;
        int count = 0;

        for (int i = 1; i <=10 ; i++) {
            year = i;
            count++;
            if(count<=3){
                growth+=1;
                System.out.println("year "+year+" - growth 1 cm\n tree size: "+growth);
            }
            if(count>3){
                growth+=2;
                System.out.println("year "+year+" - growth 2 cm\n tree size: "+growth);
            }

        }
        System.out.println("========================");
    }
}
