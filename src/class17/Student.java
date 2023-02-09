package class17;

public class Student{
    String name;
    int age;
    int id;
    double weight;
   Student(String studentsName,int StudentsAge,int StudentsId,int StudentsWeight){
       name=studentsName;
       age=StudentsAge;
       weight=StudentsWeight;
       id=StudentsId;
   }
   void printInfo(){
       System.out.println("I am :" + name+"and I am "+age+" By the way my weight is: "+weight+" and this is my id number:"+id);
   }
}
