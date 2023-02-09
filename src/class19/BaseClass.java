package class19;

public class BaseClass {
    String name="Navruz";

    void hello(){
        System.out.println("Thats a metjod from Baseclass" );
    }
}
class chld extends BaseClass{


    String name="Nava";

    void call(){
        System.out.println(name);
        System.out.println(super.name);
    }

    void hello() {
        System.out.println("method from child class");
    }

    void callingParent(){
      super.hello();
    }
}



