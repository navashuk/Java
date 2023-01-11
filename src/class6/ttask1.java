package class6;

import java.util.Scanner;

public class ttask1 {
    public static void main(String[] args) {
        System.out.println("Please enter the day");
        Scanner scan =new Scanner(System.in);
        String day= scan.next();
     /*   String day="Sunday";*/
        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("No class");
        } else if (day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")) {
            System.out.println("good");
        } else if (day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Thursday")) {
            System.out.println("manual testing");
        }else{
            System.out.println("wrong");
        }
        scan.close();
    }
}
