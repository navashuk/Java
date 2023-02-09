package class16;

public class Task3 {


  /*  void revstr(String st) {
        StringBuilder str = new StringBuilder(st);
        if (str.reverse().toString().equals(st)) {
            System.out.println(st + " is a palindrome");
        } else {
            System.out.println(st + " is NOt a palindrome");
        }
    }



    public static void main(String[] args) {

        task3homework task3=new task3homework();
        //String result=task3.isPalindrome("Kaya"); we cannot assign void methods to variables
        // System.out.println(task3.isPalindrome("Kaya");); cannot use void methods in Println
        task3.isPalindrome("Kaya");
    }
}
*/



    void isPalindrome(String inputStr) {
        StringBuilder stringBuilder=new StringBuilder(inputStr);
        stringBuilder.reverse();
        String reversedStr=stringBuilder.toString();
        if (inputStr.equals(reversedStr)) {
            System.out.println(inputStr+" is palindrome");
        }else {
            System.out.println(inputStr+" is NOT palindrome");
        }

    }

    public static void main(String[] args) {

        Task3 task3=new Task3();
        //String result=task3.isPalindrome("Kaya"); we cannot assign void methods to variables
        // System.out.println(task3.isPalindrome("Kaya");); cannot use void methods in Println
        task3.isPalindrome("Kaya");
    }
}


