package class6;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        String country = "China";
        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()) { //converts text to lowercase
            case "usa":
                System.out.println("burgers");
                break;
            case "italy":
                System.out.println("pasta");
                break;
            case "pamir":
                System.out.println("Shirchoy");
                break;
            default:
                System.out.println("im from different country i dont like it");


        }
        //Write a program to find largest of three double values
        // using if-else..if and logical operators provided
        // by a user (numbers must be distinct)
        Scanner navruz = new Scanner(System.in);
        System.out.println("Please enter 3 double values ,it must be distinct numbers");
        double number1 = navruz.nextDouble();
        double number2 = navruz.nextDouble();
        double number3 = navruz.nextDouble();

        if (number1 > number2 && number1 > number3) {
            System.out.println("number 1 is the largest");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("number 2 is the greatest");

        } else {
            System.out.println("number 3 is the largest");
        }


        int number4 = 80,number5 = 40, number6 = 45;
        if (number4 > number5 && number4 > number6) {
            System.out.println(number4 + " is the largest");
        } else {
            System.out.println( "number5 or number6 are bigger");
        }
    }
}