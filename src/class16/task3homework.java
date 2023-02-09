package class16;

import java.util.Scanner;

public class task3homework {
    public static void main(String[] args) {
        String str="dad";
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversed=st.toString();
        if(str.equals(reversed)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+"not palindrome");
        }
    }

    }

