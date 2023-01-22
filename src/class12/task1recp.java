package class12;

import java.util.Scanner;

public class task1recp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the username");
String username= scanner.next();
        System.out.println("Please enter your password");
        String password= scanner.next();
        System.out.println("Please enter your password again");
        String confirmpassword=scanner.next();
        if(username.isEmpty()|| password.isEmpty()){
            System.out.println("Usernsme and Password can not be empty");
        } else if(password.length()<8){
            System.out.println("Password is too short");
        } else if (username.contains(password)) {
            System.out.println("Password contains username");
        } else if (!password.equals(confirmpassword)) {
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password has been created");
        }


    }
}
