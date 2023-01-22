package class12;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {


        String username = "naruz";
        String password = "123456789";
        String confirmedPassword = "123456789";
        boolean isEmpty1 = username.isEmpty();
        boolean isEmpty2 = password.isEmpty();

        if (username.equals(isEmpty1) && password.equals(isEmpty2)) {
            System.out.println("Username and Password cannot be empty");
        } else if (password.length() <= 8) {
            System.out.println("Password is too short");
        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(confirmedPassword)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }


    }}
