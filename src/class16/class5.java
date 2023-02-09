package class16;

import com.sun.security.jgss.GSSUtil;

public class class5 {
    // write a method to return whether given muber is prime or not
    //return type=>boolean
    //name=>isprime
    //parameter=>int number
    boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        class5 task5=new class5 ();
        System.out.println(task5.isPrime(6));
    }}










   /*  public static void main(String[] args) {
       int a=5;
       boolean flag=true;
       if(a>1){
           for (int i =2; i <a; i++) {
               if(a%i==0){
                   flag=false;
                   break;
               }

           }
       }else{
           flag=false;
       }

        System.out.println(a+" is Prime "+":"+flag);
    }

}
*/