package SelfPractices_Summer_B20;

import java.util.Scanner;

public class FiveInOne {

    public static void main(String[] args) {

        for (int i = 1; i < 101; i++)

            if (i % 2 == 1) {

                System.out.println(i);

                for (int ii = 2; ii < 101; ii += 2) {

                    System.out.println(ii);

                    Scanner scan = new Scanner(System.in);

                    System.out.println("Please enter starting point: ");

                    int start = scan.nextInt();

                    System.out.println("Please enter end point: ");

                    int end = scan.nextInt();

                    for (int iii = start; iii <= end; iii += 5) {

                        System.out.println(iii);

                        String str = "java";

                        for (int iv = 0; iv < str.length(); iv++)

                            System.out.println(str.charAt(i));


                        for (int vi = str.length() - 1; vi >= 0; i--)

                            System.out.print(str.charAt(i));


                        for (int vii = 0; vii < 256; vii++) {

                            System.out.println(vii + "=" + (char) vii);


                            for (int viii = 97; viii <= 122; viii++)

                                System.out.println((char) viii);


                            for (int oi = 65; oi <= 90; oi++)

                                System.out.println((char) oi);


                            for (int io = 100; io <= 1000; io++)

                                System.out.println(io);
                        }
                    }
                }
            }
    }
}
