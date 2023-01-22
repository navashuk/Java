package class12;

public class StringDemp {
    public static void main(String[] args) {
        //creating an object of the String class
      String strObj= new String("Java");
      String strObj2="Java";
      //Example1
        System.out.println(strObj2.length());
        String str="Banana ";
       int len= str.length();
        System.out.println(str);


        String name="Rafik";
        if(name.length()>10){
            System.out.println("Name cant be more than 10 letters");
        }
    }
}
