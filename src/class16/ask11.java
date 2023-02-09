package class16;

public class ask11
{
  // 1 Create a method that will accept an array as parameters
    // 2 will return a sum of all elements from that array.
    //  Method should be visibly only within same package and
    //  accessible by the creating an instance of the class

 int number(int[]array ){
     int sum=0;
     for( int num:array){
         sum+=num;
     }
return sum;
 }


    public static void main(String[] args) {
        int[] arr={1,2,3};
        ask11 ask11=new ask11();
        System.out.println(ask11.number(arr));
    }
}





