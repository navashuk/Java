package class16;

public class task1tester {
    public static void main(String[] args) {
task1variables employee=new task1variables();
employee.empId="123";
employee.salary=4441;
employee.CEO="Sumair";


        task1variables employee1=new task1variables();
        employee1.empId="241";
        employee1.salary=123;

        System.out.println(employee1.CEO);
        System.out.println(employee1.empId);
        System.out.println(employee1.salary);

        System.out.println("=======");
        System.out.println(employee.empId);
        System.out.println(employee.salary);
        System.out.println(employee.CEO);
    }
}
