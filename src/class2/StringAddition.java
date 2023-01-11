package class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName="Navruz";
        String lastName="Shukroev";
        String firstName2="Nava";
        //java executes from top to bottom but if we have multiple operations on the same lines
        // it executes them from left to right

        System.out.println(firstName2+" "+firstName+" "+lastName);
        System.out.println("10"+"10");;
        System.out.println(firstName2+"10");;
        System.out.println(firstName2+true);;

    }
}
