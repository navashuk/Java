package class4;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
     // below line helps us get the input from the keyboard
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= input.nextLine();
        System.out.println("my name is " +name);

    }
}
