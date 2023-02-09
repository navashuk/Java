package class16;

import java.util.Scanner;

public class Person {
    //3 keyword are (private,protected,public)
    private double bankBalance=123.222222;
    String  address="Lester 23";// by default access level applied
    public String name="Navruz";

   private void printPhonePasssword(){
        System.out.println("pass123");
    }

  void printSSN(){
        System.out.println("233234567");
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printSSN();
        person.printPhonePasssword();


        Scanner scannessr =new Scanner(System.in);
                scannessr.next();
    }
}
