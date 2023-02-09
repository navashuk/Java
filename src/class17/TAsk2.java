package class17;

public class TAsk2 {
    public static void main(String[] args) {
        getOnlyVowels("faaf");
    }
  /*  Create a method that will accept a String as a parameter
    and return a new String that consist only of vowels.
    Method should be available inside the class only
where it was declared and executed by calling it is name8/*

   */


  private static String getOnlyVowels(String inputStr ){
     return inputStr.replaceAll("[^AEIOUYaeiyou]","");

 }


  }