public class Checkpoint3_23_c {

    public static void main(String[] args) {

        double hours = 41, wages = 10.5;

        wages *= hours >40 ? 1.5:1;  // wages = wages * hours; if it's > 40 ==> print 1.5 else (otherwise) print 1;

        System.out.println(wages);

    }
}
