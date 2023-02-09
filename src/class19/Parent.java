package class19;

public class Parent {

    String name;// prosto variables
    static String lastName;

/*
  Parent(){
        System.out.println("I am a Parent Class Constructor");
    }
*/

    public static void main(String[] args) {
        Parent parent=new Parent();
    }
    public  void hello(){// void eto metod
        System.out.println("Hello is public method");
    }

    protected static void bye(){
        System.out.println("Protected method bye from parent class");
    }
// static belong to the class rather than instance
    private void money(){
        System.out.println("Private method money from parent class");
    }

}