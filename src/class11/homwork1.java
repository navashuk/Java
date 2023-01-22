package class11;

public class homwork1 {
    public static void main(String[] args) {


      for (int i = 1; i <=4; i++) {

            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 1; k <= 4; k++) {

            for (int l = 0; l < 4 - k; l++) {
                System.out.print("*");

            }System.out.println();

        }
    }
}
