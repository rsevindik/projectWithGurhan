package com.Coding.Interview_Coding_Task_Solution;

public class WhileLoop_DoLoop {
    public static void main(String[] args) throws InterruptedException {

        int i =1;
        while(i<=10){
            System.out.println(i);
            i=i+1;    // if you put i=i++ increment would continue forever.!
        }

        int m = 1;
        while(m<=10){
            System.out.println("Java");
            m++;
        }
        int num =1;
        while(num<=100){
            if(num%2==0)
                System.out.println(num);
                num++;
        }

        int counter = 1;
        while(counter<15){
            System.out.print(counter+" ");
            counter++;
            Thread.sleep(10000);  // throws InterruptedException  will be added to main method.!!
        }




    }
}
