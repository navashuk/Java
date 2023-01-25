package class13;

public class Task1Homework {
    public static void main(String[] args) {
 String string="hello";
 if(!string.isEmpty()){

     if(string.length()%2!=0&&string.length()>3){//checks if number of character is odd
int mid=string.length()/2;
         System.out.println(string.charAt(mid));
     }
 }

 }
}
