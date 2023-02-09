package class20;

public class superkey {
    String name;
    String color ="Black";


}
class Child extends superkey{
    String color ="White";
    int age =10;
    double weight;

    void printColor(){
        String color ="Blue";
        System.out.println(color);
        System.out.println(super.color);
        System.out.println(this.color);
    }
}