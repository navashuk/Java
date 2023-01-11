package class3;

public class IfElsseee {
    public static void main(String[] args) {
        char c = 'M';
        if (c == 'M') {
            System.out.println("male");


        }
        //with non-primitive datatypes such as String we cant use ==symbol
        String name = "Snat";
        if (name.equals("Sam")) {
            System.out.println("Amazing stedent");
        }
        // ! means not so basically reverse it
        if (!name.equals("Sam")) {
            System.out.println("Amazing student");

        }

    }
}
