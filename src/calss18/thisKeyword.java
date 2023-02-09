package calss18;

public class thisKeyword {
    int a,b;
    thisKeyword(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public void sum(int a,int b){
        System.out.println("Sum of local variables = "+(a+b));
        System.out.println("Sum of instance variables ="+(this.a+this.b));
    }

    void hello(){
        System.out.println("hello batch15");
    }

    void hru(){
        System.out.println("How r u batch15");
    }

    void greetings(){
        this.hello();// this keyword refers to the current instance method
        this.hru();
    }



    public static void main(String[] args) {
        thisKeyword keyword=new thisKeyword(2,4);
      keyword.sum(12,44);


      //----------------
        keyword.greetings();
    }
}
