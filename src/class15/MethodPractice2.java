package class15;

public class MethodPractice2 {

    String reverseStr(String input){
        String newStr=" ";
        for (int i = 0; i < input.length()-1; i--) {
            newStr+=input.charAt(i);
        }
        return newStr;
    }

    String reverseStr1(String input){
        return new StringBuilder(input).reverse().toString();
    }

    String reverseStr2(String input){
        StringBuilder stringBuilder=new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }


    }



