package class9;

import java.util.Scanner;

public class homewwrok {
    public static void main(String[] args) {
        /*for (int i = 1; i <=50 ; i++) {
            if(i%3!=0){
            }
            System.out.println(i);




        }*/
    /*    Scanner input=new Scanner(System.in);
        for (int i = 0; i <=10; i++) {
            System.out.println("Do you want a credit card?");
            String response=input.next();
            if(response.equalsIgnoreCase("yes")){
            }         break;*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers starting point and ending point");

        int start = input.nextInt();
        int end = input.nextInt();
        System.out.println("start " + start + " end " + end);

        int evenSum=0;
        int oddSum=0;
        for (int i = start; i <= end; i++) {
            if(i%2==0){
                evenSum+=1;
            }else{
                oddSum+=1;
            }
        }
        System.out.println("sum of all even numbers"+evenSum);
        System.out.println(oddSum+"sum of all odd numbers");


    }
}









