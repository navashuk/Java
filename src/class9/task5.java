package class9;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total=0;
        for (int i=0; i<5; i++) {
            System.out.println("Please enter the item and ots price");
            String itemName = input.next();
            double itemPrice = input.nextDouble();
        total=total+itemPrice;
            System.out.println("Thats your total "+ total);

        }
        System.out.println("Please pay for the item");
        double amountpaid= input.nextDouble();
if(amountpaid>total){
    double change=amountpaid-total;
    System.out.println("here is your change" +change);

    }else{
    System.out.println("here is your change");
}
        System.out.println("Thanks For shopping hope to see you again");
}

    }


