package class19;

public class SuperClass {


    SuperClass(){
        System.out.println("I am a constructor from the parent class");
    }
}
class Subclass extends SuperClass{
Subclass(){
    super();
    System.out.println("i dont get it");
}


}