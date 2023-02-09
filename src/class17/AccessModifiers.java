package class17;

public class AccessModifiers {


    //static methods can be called by just name(of the class).method'sname.

    public static String reverseStr(String input){
      return new  StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {

// if we are within the same class we don't need class name
reverseStr("dsdsdss");
        System.out.println(AccessModifiers.reverseStr("ssa"));
    }
}
 // public static String nn(String ss){
// return new StringBuilder(ss).reverse().toString();
// }