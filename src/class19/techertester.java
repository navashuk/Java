package class19;

public class techertester {
    public static void main(String[] args) {

        teacher teacher = new teacher();
        teacher.name="MIss Julya";
        teacher.teacherId=3677896;
        teacher.subject="Spanish";
        System.out.println(teacher.name);

        Chemistryteacher ct=new Chemistryteacher();
        ct.age=44;
        ct.name="Nata";
        ct.schedule="5/2";
        System.out.println(ct.schedule+ct.name);

    }
}
