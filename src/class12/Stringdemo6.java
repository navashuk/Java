package class12;

public class Stringdemo6 {
    public static void main(String[] args) {
        String str="I love java";
        boolean startsWith=str.startsWith("I");// always assign it to smth
        System.out.println(str.endsWith("java"));
        System.out.println(str.startsWith("I"));

        System.out.println(str.toLowerCase().startsWith("i"));

        System.out.println(str.contains("java"));



    }
}
