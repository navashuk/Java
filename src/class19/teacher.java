package class19;

public class teacher {

   public String name;
     int teacherId;
    String subject;
    int age;

 public void printName(){
        System.out.println("Teacher name: "+name);
    }

  protected void printID(){
        System.out.println("The teacher ID is "+teacherId);
    }
   private void printSubject(){
        System.out.println(name+" teaches "+subject);
    }
}
 class Chemistryteacher extends teacher {
        String schedule;
        void printSchedule(){
        System.out.println(name+" teaches classes on "+schedule);
        }
        }

class PianoTeacher extends teacher{
    String hobby;
    void favoriteHobby(){

        System.out.println(name+" loves music");
    }
    int salary;
    void printSalary()
    {
        System.out.println(name+" earns "+salary+" for a year");
    }
}