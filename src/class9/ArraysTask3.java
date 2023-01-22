package class9;

public class ArraysTask3 {
    public static void main(String[] args) {

        //10 20 30 45 50
        int total =0;
      int []price ={10,20,30,45,50}  ;
      for (int i =0; i< price.length; i++) {
            System.out.println(price[i]);
            total+=price[i];// or total=total+price[i]
        }
        System.out.println(total);


    }
}
