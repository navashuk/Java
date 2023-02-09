package class19;

public class Child extends Parent{
    public static void main(String[] args) {
        Child child=new Child();
        child.name="Safina";
        Child.bye();
        Parent.bye();
        Parent.lastName="Shukroev";
        //child.money();// cuz its private
        System.out.println(child.name);
    }
}
