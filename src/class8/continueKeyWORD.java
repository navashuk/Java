package class8;

public class continueKeyWORD {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            if (i%3==0){// i==3||i==6||i==9(the same)
                continue;//skip
            }else {
                System.out.println(i);
            }
        }


        System.out.println("======");
        for (int i2 =1; i2 <=54; i2++) {
            if(i2%7==0){
                continue;
            }
            System.out.println(i2);
        }
        System.out.println("===ewe");

        for (int i3=1;i3<=312;i3+=5){
            if(i3%12==0){
                continue;
            }
            System.out.println(i3);
        }



    }




}
