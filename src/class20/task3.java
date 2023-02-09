package class20;

public class task3 {


 private void method (int a, int b){
        System.out.println(a+b);

    }
   private void method (int b,double a){
        System.out.println(a+b);

    }
    private void method (double a, int b){
        System.out.println(a+b);

    }

    public static void main(String[] args) {
        task3 t3=new task3();
        t3.method(2,3);
        t3.method(2.43,3);
        t3.method(2,2.3);
    }
}
