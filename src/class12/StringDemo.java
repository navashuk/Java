package class12;

import java.sql.SQLOutput;

public class StringDemo {
    public static void main(String[] args) {
        String firstname="Shukroev";
        String lastname="Navruz";
        String fullName=firstname+" " + lastname;
        System.out.println(fullName);
        System.out.println(firstname +" "+lastname);
        System.out.println(firstname.concat(" " + lastname));
    }
}
