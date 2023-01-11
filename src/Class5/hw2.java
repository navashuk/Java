package Class5;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Please enter numbers start from 1");
        int number = scaner.nextInt();
        if (number > 1 && number <= 5) {
            System.out.println("weekday");
        } else if (number > 5 && number <= 7) {
            System.out.println("weekend");
        } else {
            System.out.println("invalid nday");
        }

    }
}
