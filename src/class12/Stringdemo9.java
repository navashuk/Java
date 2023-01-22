package class12;

public class Stringdemo9 {
    public static void main(String[] args) {
     String str="ddsfffdfd";
     int counter=0;
        for (int i = 0; i <str.length(); i++) {

if (Character.isAlphabetic(str.charAt(i))){
    counter++;
}}
        System.out.println("total lphabetic in Str"+ " " +counter);
    }
}
