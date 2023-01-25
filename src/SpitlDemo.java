package class13;

public class SpitlDemo {
    public static void main(String[] args) {
        String string="I love java.I write a lot daily.I am from batch 15";
        String[] arrays=string.split("[?.!]");
        /*System.out.println(Arrays.length);*/
        System.out.println(arrays[0]);
        System.out.println(arrays[1]);

    }
}
