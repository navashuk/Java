package class20;

public class rectangle {

    void rectangle( int a, int b){
        System.out.println(a*b);
    }
    void square ( int c){
        System.out.println(c*c);
    }


    public static void main(String[] args) {
        rectangle rec=new rectangle();
      rec.rectangle(2,3);
      rec.square(2);
    }


}

