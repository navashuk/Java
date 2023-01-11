package class3;

public class TypeCasting {
    public static void main(String[] args) {
   long number=125;
   byte shorterNumber=(byte)number;
   float f=10.5f;
    int num=(int)f;
    double numb3=13.5;
    int num4=(int)numb3;
    byte b=10;
    int number2=b;// no complain cuz its bigger box tham byte
    short numm=(short) number2;
        System.out.println(shorterNumber);
        System.out.println(num);
        System.out.println(num4);
        System.out.println(number2);
        System.out.println(numm);

        float eggs=12.5f;// typecasting
        int egg=(int)eggs;//typecasting
        System.out.println(egg);

    }
}
