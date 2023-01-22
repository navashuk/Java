package class12;

public class StringDemo4 {
    public static void main(String[] args) {
        String str=" ";
        boolean isEmpty=str.isEmpty();//checks is String is empty or not
        System.out.println(str.isEmpty());

        System.out.println("===================");





        String str2="Java";
        String str3="Java";
        boolean areEqual=str2.equals(str3);
        System.out.println(areEqual);
        boolean areEqual2=str2.equalsIgnoreCase(str3);
        System.out.println(areEqual2);
    }
}
