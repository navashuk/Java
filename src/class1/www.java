package class1;

import java.util.Scanner;

public class www {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        StringBuilder revS = new StringBuilder(s);
        revS.reverse();
        System.out.println(revS);


    }



}


