package class7;

import java.util.Scanner;

public class doWhilee {
    public static void main(String[] args) {
        boolean condition = true;
        Scanner input=new Scanner(System.in);
        int number=10;
        while (condition){
            System.out.println("Please Enter a Number");
            int userInput=input.nextInt();
            if(userInput>number){
                System.out.println("u entered number is greater");
            } else if (userInput<number) {
                System.out.println("you entered samller number");

            }else{
                System.out.println("You won1");
                condition=false;
            }


        }






    }
}
