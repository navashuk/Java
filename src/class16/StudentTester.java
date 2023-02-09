package class16;

public class StudentTester {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Navruz";
        student.id = "222";
        student.schoolName = "Syntax";
        student.age = 23;
        student.weight = 85;

        Student student1 = new Student();
        student1.name = "Mo";
        student1.id = "211";
        //student1.schoolName = "2441";
        student1.age = 43;
        student1.weight = 41;


        Student student2 = new Student();
        student2.name ="Raf";
        student2.id ="351";
        //student2.schoolName ="541";
        student2.age = 13;
        student2.weight = 51;

        System.out.println(student2.schoolName);
        System.out.println(Student.schoolName);
    }
}
