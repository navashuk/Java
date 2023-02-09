package class16;

public class studentsTester {
    public static void main(String[] args) {
        Students students=new Students();
        students.numberofStudents++;
        students.id="134";
        students.name="Navruz";

        Students students2=new Students();
        students2.name="max";
        students2.id="322";
        students2.numberofStudents++;

        Students students3=new Students();
        students3.name="cad";
        students3.id="3222";
        students3.numberofStudents++;

        System.out.println(Students.numberofStudents);


    }
}
