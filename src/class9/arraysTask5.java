package class9;

public class arraysTask5 {
    public static void main(String[] args) {
/*int total=0;
        int[] number=new int[5];//an empty array of size 5 will be created
      number[0]=50;
      number[1]=30;
      number[2]=55;
      number[3]=60;
      number[4]=52;

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
            total+=number[i];
            System.out.println(total);
        }*/

        int add =0;
        int multiplication=0;
        int[] number1=new int[5];
        number1[0]=45;
        number1[1]=44;
        number1[2]=33;
        number1[3]=33;
        number1[4]=20;
        for (int j = 0; j <number1.length; j++) {
            if (j%2 == 0) {
            }
            add=add+number1[j];

        }
        System.out.println(add);







    }




}
