import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your age");
        int age= scan.nextInt();
        System.out.println("you are "+age+" years old");


        System.out.println("please enter your weight");
        double weight=scan.nextDouble();
        System.out.println("your weight is "+weight);

        System.out.println("Please enter your gender");
        char gender = scan.next().charAt(0);
        System.out.println("Your gender is "+gender);

/* Scanner=> Name of the class
scan is just a variable like we create primitive variables
(like int;double;short)
System in=>tells the computer we want to read the data from keyboard
 */
        scan.nextLine();//extra scan.nextLine to make method work
        System.out.println("Please enter your full name");
       String fullName=scan.nextLine();
       System.out.println("your name is "+ fullName );
       scan.close();//good practice

    }
}