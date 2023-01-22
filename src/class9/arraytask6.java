package class9;

public class arraytask6 {
    public static void main(String[] args) {


     double[] arr={10.5,12.0,45,10.5,23,10.5};
     int time=0;
     for (int i =0; i<arr.length ; i++) {
     if(arr[i]==12.0){
     time=time+1;
        }
        }
        System.out.println(time);
    }
}
