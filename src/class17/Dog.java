package class17;

public class Dog {
    String name;

    String breed;

    int age;

    double weight;

    Dog(String dogName, String dogBreed, String dogcolor, int dogAge, double dogWeight) {
        name = dogName;
             breed = dogBreed;
        weight = dogWeight;
        age = dogAge;
    }
    void printInfo(){
        System.out.println( " Name: "+name+"Breed: "+breed+" Age: "+age+" Weight: "+weight);
    }

}







