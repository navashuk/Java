package class16;

public class task6 {

    char getGrade(int score) {
        if (score > 90) {
            return 'A';
        } else if (score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        } else if (score > 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        task6 tassk6=new task6();
        System.out.println(tassk6.getGrade(88));
    }
}
