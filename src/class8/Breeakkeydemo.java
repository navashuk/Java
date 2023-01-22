package class8;

public class Breeakkeydemo {
    public static void main(String[] args) {
       boolean summer=true;
        int temp=75;
        while (summer){
            if (temp<=100){
                System.out.println("I love summer"+temp);
            }else{
                System.out.println("Its very hot");
                break;
     }temp+=5;
        }

        System.out.println("========");
        boolean summer2 = true;
        int temp2 = 75;

        while (summer2) {
            if (temp2<= 100) {
                System.out.println("I love summer because temperature is " + temp);
            } else {
                System.out.println("It's very hot" + temp2);
                summer2= false;
            }
            temp2+= 5;

        }


        System.out.println("=======");
        boolean championship = true;
        int goals = 25;
        while (championship) {
            if (goals <= 25) {
                System.out.println("You are the golden boot holder");

            } else {
                championship = false;
                System.out.println("You not the best");
            }
            goals += 3;
        }

        System.out.println("=--==-=-");
    }}