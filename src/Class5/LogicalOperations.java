package Class5;

public class LogicalOperations {
    /* 1 2 3 4 5 6 7 8 10   15

     */
    public static void main(String[] args) {

        System.out.println(!true);
        System.out.println(!false);
        boolean rich = true;
        System.out.println(!rich);


        int number = 9;

        if (number == 9) {
            System.out.println("Hello Java");
        } else {
            System.out.println("Hello word");
        }

        String country = "China";

        if (!country.equals("BadCountry")) {
            System.out.println("Your are Welcome");
        }
        if (country.equals("China")) {
            System.out.println("you are welcome");

        }
    }
}