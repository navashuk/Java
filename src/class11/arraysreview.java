package class11;

import java.util.Arrays;

public class arraysreview {
    public static void main(String[] args) {
        int[][] number={{10,32,14},
                       {20,43,65},
                        {33,23,44,23,3}
        };

        System.out.println(number[1][2]);
        System.out.println(Arrays.toString(number[1]));

        for (int i = 0; i <number[0].length; i++) {
            System.out.print(number[0][i]+ " ");
        }
        System.out.println("-----------------");

        int[]arr=number[2];//привязали к number2
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }
}