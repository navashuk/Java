package class8;

import java.util.Scanner;

public class RecapFor {
    public static void main(String[] args) {

        for (int i =10; i>=3 ; i-=3) {
            System.out.println(i);
        }


        System.out.println("=================");

        Scanner fetch=new Scanner(System.in);
        System.out.println("please enter the number");
        int x= fetch.nextInt();
        for (int i=0;i<x;i++) {
            System.out.print(i +" ");

        }




    }
}
