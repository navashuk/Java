package class20;

public class classs1 {

    static void method (int a, int b){
        System.out.println(a+b);

    }
    static void method (int b,double a){
        System.out.println(a+b);

    }
  static void method (double a, int b){
        System.out.println(a+b);

    }


    public static void main(String[] args) {
        classs1 meth=new classs1();
method(12,21);
method(12.5,44);
method(2,1.2);
    }
}
