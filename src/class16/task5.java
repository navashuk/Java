package class16;

public class task5 {
    boolean isPrime(int number){
        boolean flag=true;
        if(number>1){
            for (int i = 2; i <number ; i++) {
                if(number%i==0){
                    flag=false;
                    break;
                }
            }
        }else {
            flag=false;
        }
        return flag;
    }


    public static void main(String[] args) {

    task5 t5=new task5();
        System.out.println(t5.isPrime(22));

    }}
