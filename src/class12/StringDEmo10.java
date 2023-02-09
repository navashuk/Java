package class12;

import java.security.spec.RSAOtherPrimeInfo;

public class StringDEmo10 {
    public static void main(String[] args) {
        String str="JAVA IS NOT PAIN";
        System.out.println(str.indexOf("N"));
        System.out.println(str.indexOf("A"));
        System.out.println(str.indexOf("O"));
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i));

        }


    }
}
