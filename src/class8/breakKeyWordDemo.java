package class8;

public class breakKeyWordDemo {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
if(i==3){
    break;
}System.out.println(i);
        }


        System.out.println("========");

        for (int i2 = 0; i2< 5; i2++) {
            if(i2==5){
                break;
            }
            System.out.println(i2);
        }
    }

}
