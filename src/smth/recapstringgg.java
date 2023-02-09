package smth;

public class recapstringgg {
    public static void main(String[] args) {
        String string="Java is great";
char leetr=string.charAt(6);
        System.out.println(leetr);
        for (int i = 0; i <string.length(); i++){
            System.out.print(string.charAt(i));
        }

        System.out.println("+++++++++");
        //how many timees does letter (a) appeared?
        int count=0;
        for (int i = 0; i <string.length(); i++){
           if(string.charAt(i)=='a'){
               count++;
           }
        }
        System.out.println(count);
    }
}
