package class11;

import java.util.Arrays;

public class arraysreview2 {
    public static void main(String[] args) {

        int[][] matrix={{10,20,30},
                         {45,55,66},
                         {30,40,20,10,25},
        };

      //write a loop to print all the elements from this 2d array
        for (int i = 0; i <matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {//gives the size of each one 1d array
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



        int[][] arrays={{1,2,3,4,5},
                        {1,2,3,4,5},
                        {1,2,3,4,5},};

        for (int i = 0; i < arrays.length ; i++) {
            for (int j = 0; j < arrays[i].length ; j++) {
                if (arrays[i][j]%2!=0){
                    System.out.print(arrays[i][j]+" ");
                }
            }
            System.out.println();
        }



    }


}
