package class8;

import java.util.Scanner;

public class loopsWithString {
    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");
        while(input.next().equalsIgnoreCase("Student"))
            System.out.println("great student always ask for examples");

    }
}
