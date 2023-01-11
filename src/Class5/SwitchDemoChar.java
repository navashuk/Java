package Class5;

import java.util.Scanner;

public class SwitchDemoChar {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your gender");
        char gender=scanner.next().charAt(0);
        switch (gender){
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Not specified");
                break;
            default:
                System.out.println("not specified");
        }

    }
}
