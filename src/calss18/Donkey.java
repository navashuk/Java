package calss18;

public class Donkey {
    String name;
    int age;
    double weight;




    Donkey(String name,int age,double weight){
        this.age=age;
        this.name=name;
        this.weight=weight;
    }



//Donkey(){
//    System.out.println("This is non argument constructor");
//}


    /*Donkey(String Donkeyname,int Donkeyage,double weightDonkey){
        age=Donkeyage;
        name=Donkeyname;
        weight=weightDonkey;
    }*/



    void print(){
        System.out.println("Hey hey hey i am a donkey and my name is"+name+" "+" i am "+age+ " "+" and im a bit fat with " +weight);
    }
}
