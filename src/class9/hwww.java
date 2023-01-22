package class9;

public class hwww {
    public static void main(String[] args) {
        String[] name = new String[2];
        name[0] = "Navruz";
        name[1] = "Navuz";
        System.out.println( name[0]);


        System.out.println("-------");

        String[] arry=new String[6];

        arry[0]="Java";
        arry[1]="Is";
        arry[2]="Saturday";
        arry[3]="day";
        arry[4]="coding";
        arry[5]="class";
        System.out.println(arry[2]+" " + arry[1]+" "+ arry[0]+ " "+arry[4]+" "+arry[5]+ " "+arry[3]
        );

        System.out.println("==--==-=--==-=-");

        String[]cars= {"Toyota","Lamborghini","volvo","honda","audi"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+ " ");
        }


        System.out.println("+__)++++");


        int[] numberss={42,2,1,0,0};
        int sum=0;
        for (int i = 0; i < numberss.length; i++) {
            sum=sum*numberss[i];

        } System.out.println(sum);


        System.out.println("================");


        int[] ss={2,3,21,313};
        int sum1=0;
        for (int i = 0; i < ss.length; i++) {
            sum1 = sum1 + ss[i];
        }
        System.out.println(sum1);

    }


}
