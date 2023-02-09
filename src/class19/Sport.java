package class19;

public class Sport {
    String name;
    String country;

    Sport(String name,String country){
      this.name=name;
      this.country=country;

    }

    public void display(){
        System.out.println(name+" is played in " +" "+country);
    }
}

class Cricket extends Sport{
    String helmet;
    Cricket(String country,String name,String helmet){
        super(name,country);//So, every time I use super I need to put the parameters from the parent class, right?
        this.helmet=helmet;
    }
}

class Football extends Sport{
    int number;
    String team;
    Football(String name, String country,String team,int number){
        super(name, country);
        this.team=team;
        this.number=number;

    }
    void display1(){
        System.out.println(name+country+team);
    }
}