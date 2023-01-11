package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        below line is creating a box in the computers memory
        we are calling it box 1 , if we need the info that we are storing inside this box
        we can sumply say to the computer give us the cintests of box1.
        box1=>is the name of the box
        = sign will take whatever we write after it and will storeit imside the box1
        10=> is what we are storing
         */
 int box1=19;
        System.out.println(box1);// bring the contents of box1 and print them on the console
        /*
        to store whole (целые)numbers we have 4 different types of boxes.
         1)byte 2) short 3) int 4) long
        */
        byte box2=127;// range of byte is from (-128 to 127)
        byte box3=-128;
        short box4=32767;//range is (-32768 to 32767)
        short box5=-3256;
        int biggerbox=3212133;// the most used type of box code for numbers
        long maxbox=23432343423l;

        short mybox=1000;
        System.out.println(mybox);
    }
}
