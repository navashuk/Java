package class15;

public class MethodPractice3 {
   /* int[] array ={10,20,30};
        {
        int sum=0;
        for (int i =0; i < array.length; i++) {
            sum+=0;
            System.out.println(sum);


        }
        return array;

    }*/

    int arraySum(int[] arr ) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

}
