package class14;

public class recapclass13 {
    public static void main(String[] args) {
 /* String is used when we are not planning do any modifications and  need to save memory
 StringBuilder class:is exactly th same as String class but its changeable(mutable)

  */
        //Task1
        String sentence = "I love football!";
        String newSentence = sentence.replaceAll(" ", "");
        System.out.println(newSentence);

//Task2
      /*  //count how many alphabetic and numbers are there and write a code?!
        String str="sdghhjhdweghkad22323#$$@%@'lw21677";
     *//*str.replace("[^a-zZ-a0-9]","").length();*//*
        System.out.println(str.replaceAll("[^a-zZ-a0-9]","").length());
*/
        //TAsk3
        String str2 = "Is is Saturday? Is it raining? Do we have a Java class today?";
        String[] array = str2.split("[?]");


//task4
      /*  StringBuilder st= new StringBuilder("This is sentence i want to reverse");
        System.out.println(st.reverse());
        String st=st.toString();//converting a StringBuilder to String so we can call methods from String
        str.sp
*/


        String str3 = "This is sentence i want to reverse";
        String[] arra = str3.split(" ");
        for (String word : arra) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));

            }
            System.out.print(" ");
        }

        System.out.println("====================");
        String word="this";
        for (int i =word.length()-1; i>=0; i--) {
            System.out.print(word.charAt(i));

        }
        System.out.println("]]]]]]]]]]]]]]]]]]]]]");


        for(String worrd:arra){
            StringBuilder st=new StringBuilder(worrd);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }


for(String wor:arra){
    System.out.print(new StringBuilder(wor).reverse()+" ");
}

        }
    }

