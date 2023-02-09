package class13;

public class replace {
    public static void main(String[] args) {

    String string ="Batch 15 is good";
        System.out.println(string.replace(" good"," great"));

        System.out.println("{{{{{{{{{{{{{[[[[}}}}}}}}");

        String str="dddddDSDSGDfwr23eqfsv%$$#%&&&%%";
        System.out.println(str.replaceAll("[A-Z]","#"));//regex identify what exactly to replace
        System.out.println(str.replaceAll("[a-z]","#"));//regex identify what exactly to replace
        System.out.println(str.replaceAll("[A-za-z0-9]","#"));//regex identify what exactly to replace
        System.out.println(str.replaceAll("[^A-za-z0-9]","#"));//replaces character
        System.out.println(str.replaceAll("[0-9]","*"));//regex identify what exactly to replace


        System.out.println(str.replaceAll("[0-9]",""));//regex identify what exactly to replace


    }
}
// string replace help us change the word