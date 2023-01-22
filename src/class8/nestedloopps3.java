package class8;

public class nestedloopps3 {
    public static void main(String[] args) {

        /*for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==1||j==2){
                    System.out.print(" ");
                }
                System.out.print("$");
            }
            System.out.println();// for each output create new line
        }
        */

        for (int i = 0; i <3; i++) {
if(i==1){
    System.out.println();
    continue;
}
for (int j=0;j<5; j++) {
     System.out.print("*");
}
            System.out.println();
        }

    }
}
