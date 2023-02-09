package class19;

public class userClass {
    String name;
    long number;

    userClass(String name, long number){
        this.name=name;
        this.number=number;
    }
}

class userInfo extends userClass{
    String address;

    userInfo(String name,long number,String address){
        super(name,number);
        this.address=address;

    }

    public void userDetails(){
        System.out.print("NAME : "+name+" PHONE NUMBER : "+number+" ADDRESS : "+address);
    }
}


