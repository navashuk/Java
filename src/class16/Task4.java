package class16;

public class Task4 {

        /*)Create a method that will sayHello
        in different language based on the country
        that will pass when method is executed*/

        String sayHello(String countryname){

            switch (countryname){

                case "USA":
                    return "Hi";

                case "Kazakhstan":
                        return"E dolbaeb";
                case "Italy":
                    return "bongiorno";
                case "china":
                    return"Nihao";
                default:
                    return"Country is not supported";
            }
        }


    public static void main(String[] args) {
        Task4 task4=new Task4();
        System.out.println(task4.sayHello("china"));
        System.out.println(task4.sayHello("Italy" ));
        System.out.println(task4.sayHello("Tajikistan" ));
    }

}
