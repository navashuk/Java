package class6;

public class WhileLoop6 {
    public static void main(String[] args) {

     /*   int number=0;
        while(number<15){
            if (number%2==0){
                System.out.println("dfd");
            }
            number ++;
        }*/


        int number1 = 0;
        while (number1 <= 16) {
            if (number1 % 5 != 0) {
                System.out.println(number1);
            }
            number1++;
        }


        int nm = 1;
        while (nm <= 16) {
            if (nm == 5 || nm == 10 || nm == 15) {
                System.out.println(nm);
            }
            nm++;
        }
    }
}
