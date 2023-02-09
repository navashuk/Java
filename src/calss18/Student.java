package calss18;

public class Student {

    String name;
    int age;
    String address;

    Student(String name,int age,String address){
        this.address=address;
        this.name=name;
        this.age=age;

    }
    Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

        void print(){
    System.out.println(name+" "+address+" "+age);
}
void reccomend(){
    System.out.println("I do reccomend you to read Alchemic , Paolo Coelho");
}
}
