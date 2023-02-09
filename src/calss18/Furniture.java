package calss18;

public class Furniture {
    String type;// instance
    double price;
    String color;


    Furniture(String type,double price,String color){//these are local variables
this.type=type;
this.price=price;
this.color=color;
    }


    void print(){
        System.out.println(type+" price is "+price+" "+"and the color is"+color);
    }
}
