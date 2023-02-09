package class19;

public class JavaTeacher extends teacher {

  void code(){
      System.out.println("java teacher teaches how to code");
  }

    public static void main(String[] args) {
        JavaTeacher javaTeacher=new JavaTeacher();
        javaTeacher.name="Asghar";
        javaTeacher.teacherId=98765;
        javaTeacher.code();
        javaTeacher.subject="English";
        javaTeacher.age=37;
    }





}
