package calss18;

public class constructorChain {
    constructorChain(){
        System.out.println("Im non-argument constructor");
    }
    constructorChain(String str){
        this();// making a call to non argument constructor
        // this(). should always be on the first line
        System.out.println(str);
    }

constructorChain(int number,String str){
        this("im confused");
    System.out.println("This is const with int paarameter");

}

    public static void main(String[] args) {
        constructorChain chain=new constructorChain(10,"pizdec");
        System.out.println("----End of the code------");
    }
}
