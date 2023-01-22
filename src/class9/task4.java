package class9;

import java.util.Scanner;

public class task4{
    public static void main(String[] args) {
/*4)  Write a program to ask a user to enter item they want to buy and the price of that item.
    Every time user enters money accumulate the amount and tell the user how much is left to pay off.
    If user give more money program should return a change. Whenever a user done with payments program
    should say "Thank you for shopping!"8

 */

        Scanner input =new Scanner(System.in);
        System.out.println("Please enter the item");
        String item= input.nextLine();
        System.out.println("Please tell the amount");
        int price=input.nextInt();
        System.out.println("What amount did i gave  for an item?");
        int amount= input.nextInt();
        if(price>amount){
            System.out.println("you need to pay off" +(price-amount));
        }else if (price<amount){
            System.out.println("your return change is"+( amount-price));
        }
        System.out.println("Thanks for shopping");
        }

    }

